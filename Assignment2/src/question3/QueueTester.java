package question3;

import java.util.Scanner;

public class QueueTester {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		int choice;
		while((choice = menu()) != 0) {
			switch(choice) {
			case 1 : System.out.println("Enter the number");
			int num = input.nextInt();
			queue.enqueue(num);
			break;
			case 2 : System.out.println("Dropped Element : "+queue.dequeue());
			break;
			case 3 : System.out.println(queue.isEmpty());
			break;
			case 4 : System.out.println("Size : "+queue.size());
			break;
			default : System.out.println("Invalid choice");
			}
		}
		
	}
	
	private static int menu() {
		System.out.println("0.Exit");
		System.out.println("1.Enqueue");
		System.out.println("2.Dequeue");
		System.out.println("3.isEmpty()");
		System.out.println("4.Size");
		System.out.println("Enter the choice:");
		int choice = input.nextInt();
		return choice;
	}

}
