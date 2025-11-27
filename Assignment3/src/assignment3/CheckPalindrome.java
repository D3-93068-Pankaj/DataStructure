package assignment3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		System.out.println("Is Palindrome : "+ isPalindromeUsingTwoPointers(s));
		System.out.println("Is Palindrome : "+ isPalindromeUsingStringReverse(s));
		System.out.println("Is Palindrome : "+ isPalindromeUsingStack(s));
	}
	
	public static boolean isPalindromeUsingTwoPointers(String s) {
		int start = 0;
		int end = s.length()-1;
		
		while(start < end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static boolean isPalindromeUsingStringReverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		StringBuilder rev = new StringBuilder();
		
		for(int i = sb.length()-1; i >= 0; i--) {
			rev.append(sb.charAt(i));
		}
		
		return sb.equals(rev);
	}
	
	public static boolean isPalindromeUsingStack(String s) {
		Deque<Character> stack = new LinkedList<Character>();
		for(int i = 0; i < s.length(); i++) {
			stack.offerLast(s.charAt(i));
		}
		
		StringBuilder rev = new StringBuilder();
		while(!stack.isEmpty()) {
			rev.append(stack.removeLast());
		}
		
		return s.equals(rev.toString());
	}

}
