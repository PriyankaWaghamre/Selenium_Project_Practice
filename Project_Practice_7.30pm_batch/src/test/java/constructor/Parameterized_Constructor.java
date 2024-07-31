package constructor;

public class Parameterized_Constructor {

	public Parameterized_Constructor(int a)
	{
		System.out.println("1 Parameterized");
	}
	public Parameterized_Constructor(int x, int y)
	{
		System.out.println("2 Parameterized");
	}
	public Parameterized_Constructor(String s, float f, int b)
	{
		System.out.println("3 Parameterized");
	}
	public static void main(String[] args) {
		Parameterized_Constructor pc= new Parameterized_Constructor(10);
		Parameterized_Constructor pc1= new Parameterized_Constructor(60,79);
		Parameterized_Constructor pc2=new Parameterized_Constructor("abc", 52.40f, 20);
	}

}
