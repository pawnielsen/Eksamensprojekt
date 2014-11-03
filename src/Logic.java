import java.util.Calendar;
public class Logic {

	//Starter klassen Logic
	
	
	
	public static int getFirstDayOfWeek(){
		Calendar cal = Calendar.getInstance();
		Calendar first = (Calendar) cal.clone();
		int firstDayOfWeek = first.getFirstDayOfWeek();
		return firstDayOfWeek;
}

	
}

 