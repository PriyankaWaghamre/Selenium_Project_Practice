package decision_making_statement;

public class Switch_Month {

	public static void main(String[] args) {
		int month_no=3;
		String month="";
		switch(month_no)
		{
			case 1:
				//month="January";
				System.out.println("This is 1st month");
				break;
			case 2:
				System.out.println("This is 2nd month");
				break;
			case 3:
				System.out.println("This is 3rd month");
				break;
			case 4:
				System.out.println("This is 4th month");
				break;
			case 5:
				System.out.println("This is 5th month");
				break;
			case 6:
				System.out.println("This is 6th month");
				break;
			case 7:
				System.out.println("This is 7th month");
				break;
			case 8:
				System.out.println("This is 8th month");
				break;
				default:
					System.out.println("Invalid month");
				}
		System.out.println("The month is " + month);
	}

}
