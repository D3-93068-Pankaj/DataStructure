package question4;

public class LinearQueue {

	private int front = 0, rear = 0;
	private final int SIZE;
	private int[] arr;
	
	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		arr[rear++] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int t = arr[front++];
		if(front == rear) {
			front = rear = 0;
		}
		return t;
	}
	
	public boolean isFull() {
		return rear-front == SIZE;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
}
