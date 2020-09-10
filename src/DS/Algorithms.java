package DS;

import LinkedList.LinkedList;
import Stack.Person;
import Stack.Stack;

public class Algorithms {
	
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
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(16);
		list.insert(22);
		list.insert(41);
		list.insertAt(2, 56);
		list.insertAtStart(2);
		
		list.delete(1);
		
		list.show();
		
	}

}
