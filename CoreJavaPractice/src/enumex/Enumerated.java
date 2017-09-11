package enumex;
import static java.lang.System.*;

enum Day{
	monday("monday"),
	tuesday("tuesday"),
	wednesday("wednesday");

	String week;
	Day(String week){
		this.week = week;
	}
	public String getWeek() {
		return week;
	}


}
public class Enumerated {
	
	public static void main(String[] args) {

		String day = "monday";
		//Day day1 = Day.monday;
		out.println(Day.monday.getWeek());
		System.out.println(Day.tuesday);

		if(day.equals(Day.monday.getWeek())) {
			System.out.println("Today is monday and you have a meeting");
		}
		else {
			System.out.println("NOt equal");
		}
	}


}
