package stringliste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class DateiSortierer {

	public StringListe einlesen(String dateiname)
			throws DateiNichtGefundenAusnahme, IOException {
		StringListe liste = new StringListe();

		File f = new File(dateiname);
		if (!f.exists()) {
			throw new DateiNichtGefundenAusnahme(dateiname);
		}
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String wort = "";

		while (wort != null) {
			wort = br.readLine();
			if (wort != null) {
				liste.add(wort);
			}
		}

		br.close();

		return liste;
	}

	public StringListe sortiere(StringListe unsortierteListe)
			throws IllegalArgumentException {
		if (unsortierteListe == null) {
			throw new IllegalArgumentException(
					"null ist ein ungueltiges Argument.");

		}
		for (int i = 1; i < unsortierteListe.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (unsortierteListe.get(j).compareTo(
						unsortierteListe.get(j - 1)) < 0) {
					String tmp = unsortierteListe.get(j);
					unsortierteListe.set(j, unsortierteListe.get(j - 1));
					unsortierteListe.set(j - 1, tmp);
				}
			}
		}
		return unsortierteListe;
	}

	public void gebeAus(OutputStream out, StringListe zeilen) {
		String result = "";
		for (int i = 0; i < zeilen.size(); i++) {
			result += zeilen.get(i) + System.lineSeparator();
			// result += zeilen.get(i) + System.getProperty("line.separator");
		}

		try {
			out.write(result.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void sortiereDatei(String dateiname) {
		try {
			StringListe liste = einlesen(dateiname);
			sortiere(liste);
			gebeAus(System.out, liste);
		} catch (DateiNichtGefundenAusnahme e) {
			System.err.println("Die Datei " + dateiname
					+ " konnte nicht gefunden werden.");
		} catch (IOException e) {
			System.err.print(e.getMessage());
		} catch (IllegalArgumentException iae) {

		}

	}
}
