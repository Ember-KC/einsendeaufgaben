package rechnungsprogramm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Kassenanwendung {

	private HashMap<String, Artikel> artikelMap;

	public Kassenanwendung() throws IOException {
		this.artikelMap = this.leseArtikelEin();
	}

	public HashMap<String, Artikel> getArtikelMap() {
		return artikelMap;
	}

	public void setArtikelMap(HashMap<String, Artikel> artikelMap) {
		this.artikelMap = artikelMap;
	}

	public HashMap<String, Artikel> leseArtikelEin() throws IOException {
		File f = new File("daten/artikel.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String artikelZeile = "";
		String[] artikelZeileArray = null;
		HashMap<String, Artikel> artikelMap = new HashMap<String, Artikel>();
		while (artikelZeile != null) {
			artikelZeile = br.readLine();
			if (artikelZeile != null) {
				artikelZeileArray = artikelZeile.split(";");
			}
			double mwst = 0;

			// neuen Artikel einlesen
			if ("VOLLEMWST".equals(artikelZeileArray[3])) {
				mwst = Rechnung.VOLLEMWST;
			} else if ("REDMWST".equals(artikelZeileArray[3])) {
				mwst = Rechnung.REDMWST;
			} else {
				mwst = Rechnung.KEINEMWST;
			}
			Artikel artikel = new Artikel(Long.parseLong(artikelZeileArray[0]),
					artikelZeileArray[1],
					Double.parseDouble(artikelZeileArray[2]), mwst);
			artikelMap.put(artikelZeileArray[0], artikel);

		}
		br.close();
		return artikelMap;

	}

}
