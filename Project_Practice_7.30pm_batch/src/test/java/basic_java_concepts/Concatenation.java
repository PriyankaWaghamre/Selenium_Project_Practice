package basic_java_concepts;

public class Concatenation {
	
	int b=200;
	int c;
	float f;
	String s;
	static short aa;

	public static void main(String[] args) {
		int a=100;
		String s= "Automation";
		String ss="Testing";
		System.out.println("The value of a= "+a);
		System.out.println("Given String is "+s +ss);
	
		// Default value- we can call call with reference variable.variable
		Concatenation cc = new Concatenation();
		System.out.println("the value of c= " +cc.c);
		System.out.println("The value of f= " +cc.f);
		System.out.println("The value of s=" +cc.s);
		System.out.println("The value of aa=" +aa);
		
		
		
	}

}
