package question2;

public class CircularQueue {

	private int front, rear;
	private final int SIZE;
	private int[] arr;
	int counter = -1;
	public CircularQueue(int size) {
		SIZE = size;
		front = rear = -1;
		arr = new int[SIZE];
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}else {
			arr[(++rear)%SIZE] = data;
			counter++;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			int t = arr[(front+1)%SIZE];
			front = (++front)%SIZE;
			counter--;
			if(counter == -1) {
				front = rear = -1;
			}
			return t;
		}
	}
	
	public boolean isEmpty() {
		return counter == -1;
	}
	
	public boolean isFull() {
		return counter == SIZE-1;
	}
}
