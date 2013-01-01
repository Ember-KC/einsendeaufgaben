package suchen_und_sortieren;

public class Quicksort {

	void quicksort(int[] feld, int start, int ende) {
		// Basisfall: leeres Feld
		if (ende < start) {
			return;
		}
		// Basisfall: maximal 2 Elemente,
		if (ende - start <= 1) {
			// wenn nötig die beiden Werte vertauschen
			if (feld[start] > feld[ende]) {
				int temp = feld[start];
				feld[start] = feld[ende];
				feld[ende] = temp;
			}
			return;
		}
		// Feld aufteilen
		int grenze = aufteilen(feld, start, ende);
		// linken Teil (ohne Pivot) Sortieren
		quicksort(feld, start, grenze - 1);
		// rechten Teil (ohne Pivot) Sortieren
		quicksort(feld, grenze + 1, ende);
	}

	// teilt die Elemente auf und liefert die
	// Position des Pivotelements zurück
	int aufteilen(int[] feld, int start, int ende) {
		// Index von links
		int l = start + 1;
		// Index von rechts
		int r = ende;
		// Pivotelement
		int pivot = feld[start];
		// Umsortierung
		while (l < r) {
			// erstes Element größer als Pivot finden
			while (feld[l] <= pivot && l < r) {
				l++;
			}

			// erstes Element kleiner als Pivot finden
			while (feld[r] > pivot && l < r) {
				r--;
			}
			// Elemente vertauschen
			int temp = feld[l];
			feld[l] = feld[r];
			feld[r] = temp;
		}
		// Indizes haben sich getroffen
		// prüfen ob Grenze korrekt
		if (feld[l] > pivot) {
			// Grenze anpassen
			l--;
		}
		// Grenze gefunden, Pivot entsprechend vertauschen
		feld[start] = feld[l];
		feld[l] = pivot;
		return l;
	}

}
