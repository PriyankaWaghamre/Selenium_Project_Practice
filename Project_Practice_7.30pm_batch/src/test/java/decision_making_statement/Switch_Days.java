package decision_making_statement;

public class Switch_Days {

	public static void main(String[] args) {
		int day_no= 5;
				String day="";
				
				switch(day_no)
				{
				case 1:
				day="Monday";
				System.out.println("Day is Monday");
				break;
				case 2:
					day="Tuesday";
					System.out.println("Day is Tuesday");	
					break;
				case 3:
					day="Wednesday";
					System.out.println("Day is Wednesday");
				break;
				case 4:
					day="Thursday";
					System.out.println("Day is Monday");
					break;
				case 5:
					day="Friday";
					System.out.println("Day is Friday");
					break;
				case 6:
					day="saturday";
					System.out.println("Day is saturday");
			break;
				case 7:
					day="Sunday";
					System.out.println("Day is Sunday");
					break;
					
					default:
						break;
				}
				System.out.println("The day_no is " + day_no);
	}

}
