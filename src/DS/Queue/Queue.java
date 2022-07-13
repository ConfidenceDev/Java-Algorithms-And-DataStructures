package Queue;

public class Queue {

	private Person[] person;
	private int front;
	private int rear;
	private int size;
	
	public Queue(int capacity) {
		front = -1;
		rear = -1;
		size = 0;
		person = new Person[capacity];
	}
	
	public void enqueue(Person item) {
		person[++rear] = item;
		size++;
	}
	
	public Person dequeue() {
		Person item = person[++front];
		size--;
		return item;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return size;
	}
	
	public void show(){
		for(int i = 0; i <= size; i++) {
			System.out.println(person[front + i].getString());
		}
	}
}
