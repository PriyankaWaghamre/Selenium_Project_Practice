package wrapper_class;

public class Wrapper_to_Primitive_datatype {

	public static void main(String[] args) {
		// wrapper class to primitive datatype
		
		//int i= 20;
		Integer j = new Integer(20);
		int i =j.intValue();
		System.out.println(i);
		
System.out.println("--------------");

Float f= new Float(45.20);
float ff = f.floatValue();
System.out.println(ff);

System.out.println("----------------");

Long l = new Long(4963);
long lg=l.longValue();
System.out.println(lg);


	}

}
