package looping_statement;

public class Nested_Loop {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("The value of outer loop: "+ i );
		    for(int j=0;j<=7;j++)
		    {
		    	System.out.println("The value of j:" + j );
		    }
		}

	}

}
