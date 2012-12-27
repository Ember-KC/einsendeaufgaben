/**@author: Kathrin Siegmann
 * 
 */

package quiz;

import java.util.ArrayList;

public class Quiz {
	private int fragenAnzahl;
	private ArrayList<Zahlenfrage> quizFragen;

	public Quiz(int fragenAnzahl) {
		this.fragenAnzahl = fragenAnzahl;
		this.quizFragen = new ArrayList<Zahlenfrage>();
	}

	public int berechneErreichtePunkte() {
		int erreichtePunkte = 0;
		for (Zahlenfrage zf : this.quizFragen) {
			erreichtePunkte = erreichtePunkte + zf.liefereErreichtePunkte();
		}
		return erreichtePunkte;
	}

	public int liefereFragenAnzahl() {
		return this.fragenAnzahl;
	}

	public boolean fuegeFrageHinzu(Zahlenfrage zahlenfrage) {
		boolean frageStatus = false;
		if (this.quizFragen.size() < this.fragenAnzahl && zahlenfrage != null) {
			this.quizFragen.add(zahlenfrage);
			frageStatus = true;
		}

		return frageStatus;

	}

	public Zahlenfrage liefereFrage(int position) {
		return this.quizFragen.get(position);
	}

	public int berechneMaximalMoeglichePunkte() {
		int maxPunkte = 0;
		for (Zahlenfrage zf : this.quizFragen) {
			maxPunkte = maxPunkte + zf.getPunkte();
		}
		// TODO Auto-generated method stub
		return maxPunkte;
	}

}
