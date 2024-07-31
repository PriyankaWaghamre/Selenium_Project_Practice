package scanner_class;

import java.util.Scanner;

public class Scanner_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a=sc.nextInt();

		System.out.println("Enter 2nd no");
		int b=sc.nextInt();
		
		System.out.println("Select Arithmatic operator: +, -, *, /");
		char c=sc.next().charAt(0);
		
		switch(c)
		{
		case '+':
			System.out.println("Addition of a and b:" +(a+b));
			break;
		case '-':
			System.out.println("Subtraction of a and b:" +(a-b));
		case '*':
			System.out.println("Multiplication of a and b:" +(a*b));
			break;
		case '/':
			System.out.println("Division of a and b:" +(a/b));
			break;
			default:
				System.out.println("invalid operator");
	}
	}
	
}
