package jump_statement;

public class Continue_Using_DoWhile {

	public static void main(String[] args) {
		// printvalues from 30 to 10 and give continue at 15
		int i= 30;
		do
		{  
			i--;
			if(i==15)
			{
				continue;
			}
			System.out.println(i);	
		}
		while(i>=10);
	}
}

