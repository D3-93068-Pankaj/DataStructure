package question3;

public class Queue {

	static class Node{
		int data;
		Node next, prev;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node head, tail;
	private int size = 0;
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = head;
			size++;
			return;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		size++;
	}
	
	public int dequeue() {
		if(head == null) {
			System.out.println("Queue is Empty");
			return -1;
		}
		if(head == tail) {
			int data = head.data;
			head = tail = null;
			size--;
			return data;
		}
		int t = head.data;
		head = head.next;
		head.prev = null;
		size--;
		return t;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		return size;
	}
}
