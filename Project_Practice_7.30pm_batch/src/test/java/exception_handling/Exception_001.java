package exception_handling;

import java.io.FileInputStream;

public class Exception_001 {

	public static void main(String[] args) {
		int [] abc= new int[3];
		abc[0]= 10;
		abc[1]= 20;
		abc[2]=30;
		
		for(int s:abc)
		{
			System.out.println(s);
		}
		
		FileInputStream fis= new FileInputStream(null);
		
	}

}
