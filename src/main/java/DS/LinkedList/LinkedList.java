package DS.LinkedList;

// TODO : insert, insertAt, insertAtStart and delete
public class LinkedList {

	private Node head = null;
	
	public void insert(int value) {
		Node node = new Node();
		node.value = value;
		node.next = null;
		
		if (head == null) head = node;
		else {
			
			//============ Add at last node ================
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			
			n.next = node;
		}
	}
	
	public void insertAt(int index, int value) {
		Node node = new Node();
		node.value = value;
		node.next = null;
		
		if (index == 0) insertAtStart(value);
		else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void insertAtStart(int value) {
		Node node = new Node();
		node.value = value;
		node.next = head;
		head = node;
	}
	
	public void delete(int index) {
		if (index == 0) head = head.next;
		else {
			Node n = head;
			Node n1 = null;
			for(int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}
	
	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.value);
			node = node.next;
		}
		System.out.println(node.value);
	}
}