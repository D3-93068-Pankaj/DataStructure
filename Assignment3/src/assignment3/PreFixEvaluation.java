package assignment3;

import java.util.Scanner;

public class PreFixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String prefix = input.nextLine();
		
		String pf[] = prefix.split(" ");
		
		Stack stack = new Stack();
		for(int i = pf.length-1; i >= 0; i--) {
			String str = pf[i];
			if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("$")) {
				if(stack.size() < 2) {
					System.out.println("Invalid prefix expression");
					break;
				}
				int op1 = stack.pop();
				int op2 = stack.pop();
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
		System.out.println(prefix+" = "+ans);
	}

}
