package api;

import java.util.GregorianCalendar;

public class LeapYear extends GregorianCalendar {

	public void printLeapYears(int fromYear, int toYear) {
		for (int i = fromYear; i <= toYear; i++) {
			boolean leapYear = isLeapYear(i);
			if (leapYear) {
				System.out.println(i);
			}
		}

	}

}
