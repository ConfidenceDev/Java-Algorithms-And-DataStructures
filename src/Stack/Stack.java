package Stack;

public class Stack {
	
	private int top;
	private int size;
	private Person[] person;
	
	public Stack() {
		top = -1;
		size = 10;
		person = new Person[size];
	}
	
	public Stack(int size) {
		top = -1;
		this.size = size;
		person = new Person[this.size];
	}
	
	public Person pop() {
		return person[top--];
	}
	
	public boolean push(Person item) {
		if(!isFull()) {
			top++;
			person[top] = item;
			return true;
			
		}else {
			return false;
		}
	}
	
	private boolean isFull() {
		return (top == person.length -1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return person.length;
	}

	public Person[] list() {
		return person;
	}
	
	public String showList(int index) {
		return person[index].getString();
	}
}
