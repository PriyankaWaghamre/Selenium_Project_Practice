package basic_java_concepts;

public class Java_Operators {
	int a=100;
	int b=20;
	int c=a+b;
 public void aritmatic_operator()
 {
	 System.out.println("Addition of 2 nos:" +c);
		//System.out.println("Subtraction of 2 nos: " + a-b);
		System.out.println("Multiplication of 2 nos: " +a*b);
		System.out.println("Division of 2 nos: " +a%b);
		
		System.out.println(++a); // increment 
		System.out.println(--b); // decrement
 }
 public void logical()
 {
	 int x= 200;
	 System.out.println("value of y is: " +(x+100));
	 int z=x-30;
	 // int l=y-10;
 }
	public static void main(String[] args) {
		Java_Operators jo= new Java_Operators();
		jo.aritmatic_operator();
		jo.logical();
		
		

	}

}
