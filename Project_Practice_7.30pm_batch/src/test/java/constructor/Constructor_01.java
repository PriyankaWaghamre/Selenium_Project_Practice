package constructor;

public class Constructor_01 {
	public Constructor_01() {
		System.out.println("user defined constructor");
	}
 
	public void method() {
		System.out.println("instance method");
	}
	public static void main(String[] args) {
		Constructor_01 c1= new Constructor_01();
		c1.method();
		

	}

}
