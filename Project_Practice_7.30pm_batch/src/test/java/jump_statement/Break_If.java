package jump_statement;

public class Break_If {

	public static void main(String[] args) {
		// print nos form 1 to 20 break @ 17
		
		/* for(int i=1;i<=20;i++)
		{
			System.out.println(i);
			if(i==17)
			{
				break;
			}
				
		} */
		
		// while
		
/*		short s = 1;
		while(s<=10)
		{
			System.out.println(s+"");
			//s++;
			if(s==5)
			{
				break;
			}
			s++;
		}   */
		
		//  do while
		int i=1;
		do
		{
			System.out.println(i);
			i++;
			if(i==18)
			{
				break;
			}
		} while(i<=20);
		}
	}


