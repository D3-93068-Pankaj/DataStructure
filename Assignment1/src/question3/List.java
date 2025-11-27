package question3;

public class List {

	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	Node tail;
	int size = 0;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(tail == null) {
			tail = newNode;
			newNode.next = tail;
			size++;
			return;
		}
		
		newNode.next = tail.next;
		tail.next = newNode;
		size++;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(tail == null) {
			tail = newNode;
			newNode.next = tail;
			size++;
			return;
		}
		newNode.next = tail.next;
		tail.next = newNode;
		tail = newNode;
		size++;
	}
	
	public void deleteFirst() {
		if(tail == null) {
			return;
		}
		if(tail.next == tail) {
			tail = null;
			size--;
			return;
		}
		tail.next = tail.next.next;
		size--;
	}
	
	public void deleteLast() {
		if(tail == null) {
			return;
		}
		if(tail.next == tail) {
			tail = null;
			size--;
			return;
		}
		Node trav = tail.next;
		while(trav.next != tail) {
			trav = trav.next;
		}
		trav.next = tail.next;
		tail = trav;
		size--;
	}
	
	public void display() {
		if(tail == null) {
			return;
		}
		System.out.print("List :: ");
		Node trav = tail.next;
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}while(trav != tail.next);
		System.out.println();
	}
	
	public void addPosition(int pos, int data) {
		Node newNode = new Node(data);
		if(tail == null) {
			tail = newNode;
			newNode.next = tail;
			size++;
			return;
		}
		if(pos <= 1) {
			addFirst(data);
			return;
		}else if(pos >= size) {
			addLast(data);
			return;
		}else {
			Node trav = tail.next;
			for(int i = 1; i < pos-1; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
			size++;
		}
	}
	
	public void deletePosition(int pos) {
		if(tail == null) {
			return;
		}
		if(pos < 1 && pos > size) {
			return;
		}
		if(pos == 1) {
			deleteFirst();
		}else if(pos == size) {
			deleteLast();
		}else {
			Node trav = tail.next;
			for(int i = 1; i < pos-1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
			size--;
		}
	}
}
