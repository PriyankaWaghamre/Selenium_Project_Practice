package patterns;

public class Inverted_Half_Pyramid {

	public static void main(String[] args) {
		for(int x=4;x>=1;x--)
		{
			for(int y=4;y>=1;y++)
			{
				if(x>=y)
				{
					System.out.print("* ");
				}
				else
				{
				System.out.print(" ");
			}
				System.out.print("");
		}
	}

}
}