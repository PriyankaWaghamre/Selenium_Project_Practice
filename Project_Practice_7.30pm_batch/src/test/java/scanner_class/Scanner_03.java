package scanner_class;

import java.util.Scanner;

public class Scanner_03 {

	public static void main(String[] args) {
		// table of no
Scanner sc = new Scanner(System.in);
System.out.println("Enter any no");
int a=sc.nextInt();


System.out.println("your no table is:");
for(int i=1;i<=10;i++)
{
	System.out.println(i +"*" +a +"=" +(i*a));
}
	}

}
