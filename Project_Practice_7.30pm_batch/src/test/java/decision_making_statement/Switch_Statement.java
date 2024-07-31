package decision_making_statement;

public class Switch_Statement {

	public static void main(String[] args) {
		int a=1000;
		
		switch(a)
		{
		case 10 : 
			System.out.println("The value is 10");
			break;
		case 100:
			System.out.println("The value is 100");
			break;
		
		default:
		
			System.out.println("Invalid value");
			break;
	
		}
}
}