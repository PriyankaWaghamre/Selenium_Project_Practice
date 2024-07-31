package array;

public class One_D_Array {

	public static void main(String[] args) {
		// by allocating memory
		int a[]= new int[3];
		a[0]=20;
		a[1]=15;
		a[2]=60;
		for(int b=0;b<=2;b++)
		{
			System.out.println(a[b]);
		}
for(int c:a)
{
	System.out.println(c);
}
	}

}
