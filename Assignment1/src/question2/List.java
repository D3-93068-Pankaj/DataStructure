package question2;

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
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = head;
		}else if(data < head.data) {
			newNode.next = head;
			head = newNode;
		}else {
			Node trav = head;
			while(trav.next != null && trav.next.data < data) {
				trav = trav.next;
			}
			if(trav.next == null) trav.next = newNode;
			else {
				newNode.next = trav.next;
				trav.next = newNode;
			}
		}
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
	
}
