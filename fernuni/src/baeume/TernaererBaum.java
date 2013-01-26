package baeume;

public class TernaererBaum {

	private TernaererKnoten wurzel;

	public TernaererBaum(TernaererKnoten wurzel) {
		this.wurzel = wurzel;
	}

	public TernaererKnoten lieferWurzel() {
		return this.wurzel;
	}

	public boolean istEnthalten(int w) {
		return istEnthalten(this.wurzel, w);
	}

	private boolean istEnthalten(TernaererKnoten knoten, int w) {
		boolean gefunden = false;
		if (knoten == null) {
			return gefunden;
		}
		if (knoten.liefereWert() == w) {
			gefunden = true;
			return gefunden;
		}

		return (istEnthalten(knoten.liefereLinkenNachfolger(), w)
				|| istEnthalten(knoten.liefereMittlerenNachfolger(), w) || istEnthalten(
					knoten.liefereRechtenNachfolger(), w));
	}
}
