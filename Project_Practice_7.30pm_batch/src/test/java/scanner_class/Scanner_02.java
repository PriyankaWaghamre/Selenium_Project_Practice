package scanner_class;

import java.util.Scanner;

public class Scanner_02 {

	public static void main(String[] args) {
 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s= sc.nextLine();
		
		System.out.println("Enter 2nd String");
		String c= sc.nextLine();
		
		
		String a=s.concat(c);
		System.out.println(a);
		
	}

}
