package assignment3;

import java.util.Scanner;

public class PostFixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String postfix = input.nextLine();
		
		String pf[] = postfix.split(" ");
		
		Stack stack = new Stack();
		for(String str : pf) {
			if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("$")) {
				if(stack.size() < 2) {
					System.out.println("Invalid postfix expression");
					break;
				}
				int op2 = stack.pop();
				int op1 = stack.pop();
				int result = 0;
				switch(str) {
				case "+" : result=op1+op2;
				break;
				case "-" : result=op1-op2;
				break;
				case "*" : result=op1*op2;
				break;
				case "/" : result=op1/op2;
				break;
				case "$" : result = (int)Math.pow(op1, op2);
				}
				stack.push(result);
			}else {
				stack.push(Integer.parseInt(str));
			}
		}
		
		int ans = stack.pop();
		System.out.println(postfix+" = "+ans);
		
	}

}
