package has_a_relationship;

public class Class_04 {

	public void Child_Method() {
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		Class_03 c3= new Class_03();
		System.out.println(c3.d);
		c3.parent_method();
		

	}

}
