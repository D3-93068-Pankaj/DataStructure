package question3;

public class Stack {

	static class Node{
		int data;
		Node next, prev;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node head, tail;
	private int size = 0;
	
	public void push(int data) {
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
	
	public int pop() {
		if(head == null) {
			System.out.println("Stack is empty");
			return -1;
		}
		if(head == tail) {
			int t = head.data;
			head = tail = null;
			size--;
			return t;
		}
		int t = tail.data;
		tail = tail.prev;
		tail.next = null;
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
