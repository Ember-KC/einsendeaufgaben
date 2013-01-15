package api;

public class LeapYearMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LeapYear leapy = new LeapYear();
		leapy.printLeapYears(1995, 2011);
	}

	public double radius(double flaeche) {
		return Math.sqrt(flaeche / Math.PI);
	}
}
