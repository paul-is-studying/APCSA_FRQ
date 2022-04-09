package test2;

// Requires: APCalendar.java
public class _1_APCalendarMain {
	
	public static void main(String[] args) {
 
		int y1, y2;
		
		// (a) : 1, 0, 1, 25
		y1 = 2019;
		y2 = 2021;
		System.out.println(y1+"~"+y2+": "+APCalendar.numberOfLeapYears(y1, y2));
		y1 = 2099;
		y2 = 2101;
		System.out.println(y1+"~"+y2+": "+APCalendar.numberOfLeapYears(y1, y2));
		y1 = 1999;
		y2 = 2001;
		System.out.println(y1+"~"+y2+": "+APCalendar.numberOfLeapYears(y1, y2));
		y1 = 2000;
		y2 = 2100;
		System.out.println(y1+"~"+y2+": "+APCalendar.numberOfLeapYears(y1, y2));
		
		// *** testing implementation not shown methods
		System.out.println(APCalendar.firstDayOfYear(2020));
		System.out.println(APCalendar.firstDayOfYear(2021));
		System.out.println(APCalendar.firstDayOfYear(2022));

		System.out.println(APCalendar.dayOfYear(1,1,2020));
		System.out.println(APCalendar.dayOfYear(2,1,2020));
		System.out.println(APCalendar.dayOfYear(5,8,2020));
		
		// (b) : 6, 5, 0
		System.out.println(APCalendar.dayOfWeek(3,21,2020)); // 0=Sunday, 1=Monday, ...,  6=Saturday.
		System.out.println(APCalendar.dayOfWeek(5,8,2020)); // 0=Sunday, 1=Monday, ...,  6=Saturday.
		System.out.println(APCalendar.dayOfWeek(2,2,2020)); // 0=Sunday, 1=Monday, ...,  6=Saturday.
		
	}
	
}
