package jump_statement;

public class Continue_Jump_Statement {

	public static void main(String[] args) {
		// print values from 20 to 50 and give continue at 25
		int i=20;
		while(i<=50)
		{
			i++;
			if(i==25)
			{
			continue;
			}
			
			System.out.println(i);
			
		}}
}


/*
int y = 30;
while(y>=10) {
	  y--;
	  if (y==20) {
		  continue;	 
	  }  
	 System.out.println(y);
	  

		  
	  }  */