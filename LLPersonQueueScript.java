public class LLPersonQueueScript {

	public static void main(String[] args) {

		Supermarket smQueue = new Supermarket();
		/*
		 * An empty queue is created.
		 */

		Person sol = new Person("Solomon");
		Person dan = new Person("Daniel");
		/*
		 * Two objects of type Person are created.
		 * This does not affect the queue yet.
		 */

		smQueue.addPerson(sol);
		/*
		 * Solomon has been added to the queue.
		 */

		System.out.println(((Person)smQueue.peek()).getName());
		/*
		 * "Solomon" is outputted. The peek() method returns
		 * the object at the front of the queue without affecting
		 * the queue itself.
		 */

		smQueue.addPerson(dan);
		/*
		 * Daniel has been added to the queue.
		 * Daniel is not at the front of the queue, and so
		 * smQueue.peek() would still return Solomon.
		 */

		/*
		 * Let's assume a teller becomes available free.
		 */

		smQueue.servePerson();

		/*
		 * The servePerson() method will return the 'sol' object
		 * and remove it from the queue. Daniel is now the only
		 * one left in the queue.
		 */

		System.out.println(((Person)smQueue.peek()).getName());
		/*
		 * "Daniel" is outputted because he is next in the queue.
		*/

		/*
		 * Another teller becomes free, so Daniel is dequeued and 
		 * the queue becomes empty.
		 * /
		smQueue.servePerson();
		/*
		 * The servPerson() method will return the 'dan' object
		 * and remove it from the queue.
		 */
	}
}