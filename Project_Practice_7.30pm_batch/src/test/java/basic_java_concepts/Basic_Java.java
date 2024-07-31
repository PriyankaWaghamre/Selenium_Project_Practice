package basic_java_concepts;

public class Basic_Java {
	
	int i;     // // instance variable
	static short s=10;   // static variable
	//float f= 200.50f;
	//double d= 1000.00;
	
	// Instance method 
	public void m1()
	{
		int x = 600;
		System.out.println("The value of x: " + x);
		System.out.println("This is instance method");
	}
	
	// static method
	public static void m2()
	{
		int l= 700;
		System.out.println("The value of l: " + l);
		System.out.println("This is static method");
	}
	
	public static void main(String[] args) {
	System.out.println(100);
	System.out.println("Automation testing");
	Basic_Java bj = new Basic_Java();
	bj.m1(); // instance method
	m2(); // static method
	}

}
