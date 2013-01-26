package api;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class StringFilterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringFilter filter = new StringFilter("daten/input.txt",
				"daten/output.txt");
		try {
			ArrayList<String> stringList = filter.readFile();
			ArrayList<String> capitalStrings = filter.checkStrings(stringList);
			filter.writeFile(capitalStrings);
			filter.findeKuerzesteUndLaengsteZeichenkette(capitalStrings);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
