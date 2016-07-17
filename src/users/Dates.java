package users;

import java.util.*;
import java.text.*;

public class Dates {
	
	/*getDate
	 * when called, this function returns the current date in a formatted String
	 */
	public static String getDate(){
		
		Date now = new Date();
		SimpleDateFormat simp = new SimpleDateFormat ("MM/dd/yyyy");
		
		return simp.format(now);
	}

}
