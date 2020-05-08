
public class Algorithms {

	
	public static void main(String[] args) {
		
		Stack stack = new Stack(20);
		Person person1 = new Person("John", 20);
		Person person2 = new Person("Doe", 19);
		
		stack.push(person1);
		stack.push(person2);
		
		for(Person i : stack.list()) {
			System.out.println(i);
		}
	}

}
