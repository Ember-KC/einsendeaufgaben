package api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class StringFilter {
	private String inputFile;
	private String outputFile;

	public StringFilter(String inputFile, String outputFile) {
		this.inputFile = inputFile;
		this.outputFile = outputFile;

	}

	// die Datei wird ausgelesen
	// Werte in eine ArrayList schreiben

	public ArrayList<String> readFile() throws FileNotFoundException {
		ArrayList<String> stringList = new ArrayList<String>();
		try {
			File f = new File(inputFile);
			FileReader fileReader = new FileReader(f);
			BufferedReader buffy = new BufferedReader(fileReader);

			String wort = "";
			try {
				while (wort != null) {
					wort = buffy.readLine();
					stringList.add(wort);
				}

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Fehler beim Lesen der Datei.");

			}
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
			System.out.println("Datei nicht gefunden.");

		}
		return stringList;

	}

	// prüfen, welche Strings mit Großbuchstaben anfangen und in eine neue
	// ArrayList
	// schreiben

	public ArrayList<String> checkStrings(ArrayList<String> stringList) {
		ArrayList<String> capitalStrings = new ArrayList<String>();
		for (String wort : stringList) {
			if (wort != null) {

				if (Character.isUpperCase(wort.charAt(0))) {
					capitalStrings.add(wort);
				}
			}
		}
		return capitalStrings;
	}

	// alle Strings, die mit einem Großbuchstaben anfangen, werden in eine
	// andere Datei geschrieben

	public void writeFile(ArrayList<String> stringList)
			throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(this.outputFile);
		for (String wort : stringList) {
			pw.println(wort);
			pw.flush();
		}
		pw.close();

	}
}
