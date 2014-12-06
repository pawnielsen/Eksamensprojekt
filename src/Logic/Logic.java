package Logic;
import java.util.Calendar;
import GUI.Message;
public class Logic {

	//Starter klassen Logic
	
	private static String testusername = "Paw";
	private static String testpassword = "1234";
	
	
	public static int getFirstDayOfWeek(){
		Calendar cal = Calendar.getInstance();
		Calendar first = (Calendar) cal.clone();
		int firstDayOfWeek = first.getFirstDayOfWeek();
		return firstDayOfWeek;
	}
	
	public static boolean login (String username, String password){
		if (username.equals(testusername)){
			if(password.equals(testpassword)){
				
				return true;
				
			}else{
				//password does not match
				Message m = new Message("The password does not match");
				m.setVisible(true);
				return false;
			}
		}else{
			//username does not match
			Message m = new Message("The username does not exist");
			m.setVisible(true);
			return false;
		}
	}

	
}

 