package selbsttestaufgaben;

public class MaximumSuche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] testArray = { 1, 7, 4, 99, 5, 6, 7 };
		System.out.println(maximumSuchen(testArray));
	}

	public static int maximumSuchen(int[] intArray) {
		int max = intArray[0];
		for (int i : intArray) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
