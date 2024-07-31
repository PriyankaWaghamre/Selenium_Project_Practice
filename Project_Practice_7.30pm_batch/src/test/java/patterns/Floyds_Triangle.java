package patterns;

public class Floyds_Triangle {

	public static void main(String[] args) {
		// floyd's triangle
		int a=1;
		for(int x=1;x<=5;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
