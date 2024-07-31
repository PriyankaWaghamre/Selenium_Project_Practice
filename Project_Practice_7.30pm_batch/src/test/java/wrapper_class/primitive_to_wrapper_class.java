package wrapper_class;

public class primitive_to_wrapper_class {

	public static void main(String[] args) {
		
		// prim datatype to wrapper class  can convert prim datatype to his wrapper class only
		int a = 50;
		Integer b = Integer.valueOf(a);
		System.out.println(b);

		float f= 245.245f;
		Float d = Float.valueOf(f);
		System.out.println(d);
	}

}
