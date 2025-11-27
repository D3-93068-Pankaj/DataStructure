package question2;

import java.util.Scanner;

public class Tester {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of queue");
		int size = input.nextInt();
		
		CircularQueue cq = new CircularQueue(size);
		int choice;
		while((choice = menu()) != 0) {
			switch(choice) {
			case 1 : System.out.println("Enter the number");
			int num = input.nextInt();
			cq.enqueue(num);
			break;
			case 2 : int ele = cq.dequeue();
			System.out.println("Dropped element:"+ele);
			break;
			case 3 : System.out.println(cq.isEmpty());
			break;
			case 4 : System.out.println(cq.isFull());
			break;
			default : System.out.println("Invalid Choice");
			}
		}
	}
	
	public static int menu() {
		System.out.println("0.Exit");
		System.out.println("1.Enqueue");
		System.out.println("2.Dequeue");
		System.out.println("3.isEmpty()");
		System.out.println("4.isFull()");
		System.out.println("Enter the choice:");
		int choice = input.nextInt();
		return choice;
	}

}
