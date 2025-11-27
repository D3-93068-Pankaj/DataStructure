package question4;

import java.util.HashMap;
import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to insert in the array");
		int n = input.nextInt();
		
		System.out.println("Enter the elements");
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		int mode = -1;
		int max = 0;
		for(Integer key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				mode = key;
			}
		}
		System.out.println("The mode of given array is "+mode);
	}

}
