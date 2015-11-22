/*
 * Implementation of PersonQueue 
 * Note: the method, Person retrieve() has been changed to 
 *       Person retrieve(int count) for simplicity purpose
 */

public class LLPersonQueue implements PersonQueue {
    

	/**
     
 	 * The head of the stack: the visible node
     
 	 */
    
	private PersonQueueNode head;
	private int listCount;


    
	public LLPersonQueue() {
	  

		head = new PersonQueueNode(null);
		listCount = 0;
    
	}

    

	public void insert(Person person) {
	  

		PersonQueueNode temp = new PersonQueueNode(person);

		PersonQueueNode current = head;	  

		while (current.getNext() != null) {
		

			current = current.getNext();
	  
		}
	  

		current.setNext(temp);
		listCount++;	  
    
	}

    
////

	public void insert(Person person, int index) {

		PersonQueueNode temp = new PersonQueueNode(person);
		PersonQueueNode current = head;

		for(int i = 1; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}
		
		temp.setNext(current.getNext());

		current.setNext(temp);
		listCount++;
	}

////

	public Person retrieve(int index) {

		if(index <= 0) {

			return null;
		}

		PersonQueueNode current = head.getNext();

		for(int i = 1; i < index; i++) {
			if(current.getNext() == null)
				return null;
			
			current = current.getNext();
		}
		return current.getPerson();
	}
////

	public boolean remove(int index) {

		if(index < 1 || index > size()) {

			return false;
		}
		
		PersonQueueNode current = head;

		for(int i = 1; i < index; i++) {
			if(current.getNext() == null)
				return false;
			
			current = current.getNext();
		}

		current.setNext(current.getNext().getNext());
		listCount--;
		return true;
	}
////

	public int size() {

		return listCount;
	}
	
	public String toString() {

		PersonQueueNode current = head.getNext();
		String output = "";

		while(current != null) {
			output += "[" + current.getPerson().toString() + "]";
			current = current.getNext();
		}
		return output;
	}
////

	private class PersonQueueNode {

		PersonQueueNode next;

		Person person;

		public PersonQueueNode (Person person) {
			next = null;
			this.person = person;
		}
		
		public PersonQueueNode (Person person, PersonQueueNode next) {
			this.next = next;
			this.person = person;
		}
		
		public Person getPerson() {
			return person;
		}
		
		public void setPerson(Person person) {
			this.person = person;
		}
		
		public PersonQueueNode getNext() {

			return next;
		}
		
		public void setNext (PersonQueueNode next) {

			this.next = next;
		}
	}
}
