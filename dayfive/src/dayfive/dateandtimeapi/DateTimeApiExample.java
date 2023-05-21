package dayfive.dateandtimeapi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeApiExample {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date= "+date);
		//System.out.println("date= "+date.getMonth());
		System.out.println("System date: "+date.toString());
		Date date2 = new Date(9999971027l);
		System.out.println(date2);
		System.out.println(date.after(date2));
		System.out.println(date.before(date2));
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date2);
		System.out.println(strDate);
		
		SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(formatter1.format(date2));
		formatter1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		System.out.println(formatter1.format(date2));
		System.out.println(formatter1.format(date));
	}
}
