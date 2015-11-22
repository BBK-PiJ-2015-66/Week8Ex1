/**
 
 * A node in a dynamic singly-linked list of Strings
 
 */

public class Person {
    

	private String name;
    
	private Person next;


    
	public Person(String name) {
	  

		this.name = name;
	  
		next = null;
    
	}

    

	/**
     
 	 * Returns the string in this node
     
 	 */
    
	public String getName() {
	  
	
		return name;
    
	}

    

	/**
     
	 * Set the next node to point to the given node
     
	 */
    
	public void setNext(Person node) {
	  

		next = node;		
    
	}

    

	/**
     
	 * Set the next node to point to the given node
     
	 */
    public Person getNext() {
	  

		return next;		
    
	}

}