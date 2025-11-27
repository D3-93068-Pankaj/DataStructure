package assignment6;

import java.util.Scanner;

public class InsertionSortDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to insert into an array");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of an array");
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Array before sort");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		System.out.println("Array after sort");
		insertionSortDesc(arr, n);
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	private static void insertionSortDesc(int arr[], int n) {
		
		for(int i = 1; i < n; i++) {
			for(int j = i-1; j >= 0; j--) {
				if(arr[j+1] > arr[j]) {
					int t = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = t;
				}else {
					break;
				}
			}
		}
	}
}
