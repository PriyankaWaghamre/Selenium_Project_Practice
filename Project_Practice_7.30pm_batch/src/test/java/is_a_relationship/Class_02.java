package is_a_relationship;

public class Class_02 extends Class_01
{

	short s=10;
	public void put()
	{
		System.out.println("put method from class_02");
	}
	public static void main(String[] args) {
		Class_02 c2= new Class_02();
		System.out.println(c2.a);
		System.out.println(c2.f);
		System.out.println(c2.s);
		c2.get();
		c2.put();

	}

}
