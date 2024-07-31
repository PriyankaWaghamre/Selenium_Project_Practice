package array;

public class Array_without_memory_allocation {

	public static void main(String[] args) {
		int [] abc= {5,90,25,65,17,86,29,45};
	//	System.out.println(abc.length);
		//System.out.println(abc[5]);
		
		for(int f : abc)
		{
			//System.out.println(f);
		}
		
		for(int i=0;i<8;i++)
		{
			System.out.println(abc[i]);
		}
	}

}
