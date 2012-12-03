package selbsttestaufgaben;

public class StringbuilderUebung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(
				"StringBuilder-Objekte sind veränderlich.");
		sb.delete(6, 13);
		sb.insert(20, "un");
		System.out.println(sb);

		StringBuilder sbb = new StringBuilder("LAGERTONNE");
		sbb.reverse();
		sbb.delete(0, 2);
		System.out.println(sbb);
	}

}
