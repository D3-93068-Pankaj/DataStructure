package question3;

import java.util.Scanner;

public class Tester {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		int choice;
		while((choice = menu()) != 0) {
			switch(choice) {
			case 1 : System.out.println("Enter the number");
			int num = input.nextInt();
			stack.push(num);
			break;
			case 2 : System.out.println("Dropped Element: "+stack.pop());
			break;
			case 3 : System.out.println(stack.isEmpty());
			break;
			case 4 : System.out.println("Size : "+stack.size());
			break;
			default : System.out.println("Invalid Choice");
			}
		}
	}

	public static int menu() {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.isEmpty()");
		System.out.println("4.Size");
		System.out.println("Enter the choice");
		int choice = input.nextInt();
		return choice;
	}
}
