package question1;

public class Stack {

	private int top = -1;
	private int arr[];
	private final int SIZE;
	
	public Stack(int size){
		SIZE = size;
		arr = new int[SIZE];
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			top++;
			arr[top] = data;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			int t = arr[top];
			top--;
			return t;
		}
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE-1;
	}
}
