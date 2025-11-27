package question1;

import java.util.Scanner;

public class ReverseArrayUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = input.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the number into an array");
		for(int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		
		Stack stack = new Stack(size);
		for(int i = 0; i < size; i++) {
			stack.push(arr[i]);
		}
		
		int revArr[] = new int[size];
		for(int i = 0; i < size; i++) {
			revArr[i] = stack.pop();
		}
		
		System.out.println();
		for(int i = 0; i < size; i++) {
			System.out.print(revArr[i] + " ");
		}
	}

}
