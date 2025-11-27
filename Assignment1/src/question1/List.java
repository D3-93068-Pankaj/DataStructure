package question1;

public class List {

	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	Node head, tail;
	int size = 0;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = head;
			size++;
			return;
		}
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void display() {
		if(head == null) {
			return;
		}
		System.out.print("List :: ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void insertNodeBefore(int data,int val) {
		Node newNode = new Node(data);
		if(head == null) {
			return;
		}
		if(head.data == val) {
			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		Node trav = head;
		while(trav.next != null && trav.next.data != val) {
			trav = trav.next;
		}
		if(trav.next == null) return;
		newNode.next = trav.next;
		trav.next = newNode;
		size++;
		
	}
	
	public void insertNodeAfter(int data, int val) {
		if(head == null) {
			return;
		}
		Node trav = head;
		while(trav != null && trav.data != val) {
			trav = trav.next;
		}
		if(trav == null) return;
		Node newNode = new Node(data);
		newNode.next = trav.next;
		trav.next = newNode;
		size++;
	}
}
