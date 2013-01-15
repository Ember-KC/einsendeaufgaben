package api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Rechner {
	private String filename;

	public Rechner(String filename) {
		this.filename = filename;
	}

	public long addiere() throws IOException {
		long ergebnis = 0;
		File f = new File(filename);
		System.out.println(f.getCanonicalPath());
		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr);
		String zahl = "";
		try {
			while (zahl != null) {
				zahl = br.readLine();
				if (zahl == null) {
					break;
				}
				Long longZahl = Long.decode(zahl);
				ergebnis = ergebnis + longZahl;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br.close();
		return ergebnis;
	}
}
