package question1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		
		int arr[] = {1,2,3,3,4,2,5,6,1,3};
		
		int lastOccurenceIndex = -1;
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] == key) {
				lastOccurenceIndex = i;
				break;
			}
		}
		
		System.out.println("The last occurence of "+key+" is "+lastOccurenceIndex);
	}

}
