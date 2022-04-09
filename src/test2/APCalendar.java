package test2;

import java.util.Calendar;

public class APCalendar {
	
	/** Returns true if year is a leap year and false otherwise. */
	private static boolean isLeapYear(int year) {
		// implementation not shown
		return (year%4==0 && year%100 != 0 || year%400==0) ;
	}
	
	/** Returns the number of leap years between year1 and year2, inclusive.
	* Precondition: 0 <= year1 <= year2
	*/
	public static int numberOfLeapYears(int year1, int year2) {
		// to be implemented in part (a) 
		int count = 0;
		for (int i = year1;i<=year2; i++){
			if(isLeapYear(i)){
				count++;
			}
		}
		return count;
	}
	
	/** Returns the value representing the day of the week for the first day of year,
	* where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
	*/
	public static int firstDayOfYear(int year){  // public for test purposes
		// implementation not shown
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DAY_OF_YEAR, 1);
		//System.out.println( cal.get(Calendar.DAY_OF_WEEK) );// 1=Sun 2=Mon .. 7=Sat
		return cal.get(Calendar.DAY_OF_WEEK)-1;
	}
	
	/** Returns n, where month, day, and year specify the nth day of the year.
	* Returns 1 for January 1 (month = 1, day = 1) of any year.
	* Precondition: The date represented by month, day, year is a valid date.
	*/
	public static int dayOfYear(int month, int day, int year){ // public for test purposes
		// implementation not shown
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // 0 = jan
		cal.set(Calendar.DAY_OF_MONTH, day);
		return cal.get(Calendar.DAY_OF_YEAR);
	}
	
	/** Returns the value representing the day of the week for the given date
	* (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
	* and 6 denotes Saturday.
	* Precondition: The date represented by month, day, year is a valid date.
	*/
	public static int dayOfWeek(int month, int day, int year){ 
		// to be implemented in part (b) 
		int doy = dayOfYear(month,day,year);
		int wd = firstDayOfYear(year); // 0~6, cannot overload (%)
		int dow = wd + (doy-1);
		return dow;
	}
	// There may be instance variables, constructors, and other methods not shown.
}
