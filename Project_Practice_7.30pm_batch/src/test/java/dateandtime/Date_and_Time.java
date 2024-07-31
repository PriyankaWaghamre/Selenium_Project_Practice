package dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_and_Time {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yy mm:ss");
		//System.out.println("dd MM yy");
		System.out.println(sdf.format(d));
		System.out.println(sdf.getCalendar());
		

	}

}
