package array;

public class MultiD_Array_allocating_memory {

	public static void main(String[] args) {
		// 3 rows 3 col
		
		int [][] table = new int [3][3]; 
		table [0][0]=50;
		table [0][1]=50;
		table [0][2]=50;
		
		table [1][0]=50;
		table [1][1]=50;
		table [1][2]=50;
		
		table [2][0]=50;
		table [2][1]=50;
		table [2][2]=50;
		System.out.println(table.length);
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(table[i][j]+ " ");
			}
			System.out.println();
		}
		
		

	}

}
