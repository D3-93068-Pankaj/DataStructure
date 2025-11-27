package question2;

import java.util.Scanner;

public class NthOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many elements you want to insert in an array");
		int len = input.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the elements");
		for(int i = 0; i < len; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter the key to find");
		int key = input.nextInt();
		System.out.println("Enter the n occurences");
		int n = input.nextInt();
		
		int count = 0;
		int index = -1;
		for(int i = 0; i < len; i++) {
			if(arr[i] == key) {
				count++;
				if(count == n) {
					index = i;
					break;
				}
			}
		}
		if(index == -1)
			System.out.println("Is not present");
		else
			System.out.println("The element's "+n+" occurence is present at the index "+index);
	}

}
