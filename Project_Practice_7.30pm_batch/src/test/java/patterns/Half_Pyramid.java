package patterns;

public class Half_Pyramid {

	public static void main(String[] args) {
		//4*4
		for(int a=1;a<=4;a++)
		{
			for(int b=1;b<=4;b++)
			{
				if(a>=b)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}

	}

}
