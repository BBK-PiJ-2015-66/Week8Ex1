public class Supermarket {

	private LLPersonQueue list;
	
	public Supermarket() {

		list = new LLPersonQueue();
	}

	public boolean isEmpty() {

		return (list.size() == 0);
	}

	public void addPerson(Person person) {

		list.insert(person);
	}

	public Person servePerson() {

		Person person = list.retrieve(1);

		list.remove(1);
		
		return person;
	}

	public Person peek() {

		return list.retrieve(1);
	}
}