package patterns;

public class Triangle_Pattern {

	public static void main(String[] args) {
		// 0-1 Triangle pattern
		
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
		{
		
			int add =i+j;
		if(add%2==0)
		{
			System.out.print("1  ");
		}
		else
		{
			System.out.print("0  ");
		}
		}
 System.out.println();
	}

}
}
