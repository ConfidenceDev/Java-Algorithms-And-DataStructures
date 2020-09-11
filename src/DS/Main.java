package DS;

import LinkedList.LinkedList;
import Queue.Queue;
import Queue.Person;
import Stack.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		//======================== Stack =====================================
		/*Stack stack = new Stack(20);
		Person person1 = new Person("John", 20);
		Person person2 = new Person("Doe", 19);
		
		stack.push(person1);
		stack.push(person2);
		
		for(Person i : stack.list()) {
			System.out.println(i);
		}*/
		
		//======================== LinkedList =================================
		/*LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(16);
		list.insert(22);
		list.insert(41);
		list.insertAt(2, 56);
		list.insertAtStart(2);
		
		list.delete(1);
		list.show(); */
		
		//======================== Queue ======================================
		Queue queue = new Queue(10);
		queue.enqueue(new Person("Nate", 20));
		queue.enqueue(new Person("John", 10));
		
		queue.dequeue();
		
		queue.enqueue(new Person("Mary", 25));
		queue.enqueue(new Person("Collins", 17));
		
		System.out.println();
		System.out.println(queue.size());
		System.out.println();
		
		queue.show();
	}
}
