package collection;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		//Array_List <Integer>= new Array_List();
		 ArrayList<Integer> aa = new ArrayList<Integer>(); 
		 aa.add(20);
		 aa.add(30);
		 aa.add(63);
		 aa.add(80);
		 aa.add(89);
		 aa.add(79);
		 aa.add(73);
		 aa.add(30);
		 
		aa.remove(5);
		System.out.println(aa.get(3));
		 System.out.println(aa.contains(30));
		 System.out.println(aa);
	}

}
