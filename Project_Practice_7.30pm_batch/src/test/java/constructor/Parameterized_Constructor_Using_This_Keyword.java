package constructor;

public class Parameterized_Constructor_Using_This_Keyword {

	public Parameterized_Constructor_Using_This_Keyword() {
		this(10);
		System.out.println("User defined");
	}
	public Parameterized_Constructor_Using_This_Keyword(int a) {
		this(50,60);
		System.out.println(" 1 Parameterized Constructor");
	}
	public Parameterized_Constructor_Using_This_Keyword(int a, int b)
	{
		this("construt", 20, 52.20f);
		System.out.println(" 2 Parameterized Constructor");
	}
	public Parameterized_Constructor_Using_This_Keyword(String xyz, int x, float f)
	{
		System.out.println(" 3 Parameterized Constructor");
	}
	public static void main(String[] args) {
		Parameterized_Constructor_Using_This_Keyword pc = new Parameterized_Constructor_Using_This_Keyword();
		
		
	}

}
