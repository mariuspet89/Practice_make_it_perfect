package TimeConversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Result {
	public static String timeConversion(String s) {
		
		DateFormat inFormat = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		String myDate = "";
		try {
			date = inFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (date != null) {
			myDate = outFormat.format(date);
		}
		return myDate;
	}
}
