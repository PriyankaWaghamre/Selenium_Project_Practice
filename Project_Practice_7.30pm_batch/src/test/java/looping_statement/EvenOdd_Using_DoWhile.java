package looping_statement;

public class EvenOdd_Using_DoWhile {

	public static void main(String[] args) {
		// print even nos from 1 to 50
		int i=1;
	/*	do
		{
			if(i%2==0)
			{
				System.out.println("Even nos are"+ i );
			}
			i++;
		}
		while(i<=50); */
		
		do
		{
			if(i%2!=0)
			{
				System.out.println("no is odd: " + i);
			} 
			i++;
		}
		while(i<=50);
		
		

	}

}
