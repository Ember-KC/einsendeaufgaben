package quiz;

public class SchaetzFrage extends AbstrakteZahlenfrage {
	private int richtig;
	private int prozent;

	public SchaetzFrage(String frage, int punkte, int richtig, int prozent) {
		super(frage, punkte);
		this.richtig = richtig;
		this.prozent = prozent;
	}

	public boolean istRichtigBeantwortet() {
		boolean antwortStatus = false;
		int abweichung = this.richtig - antwort;
		int erlaubteAbweichung = this.richtig / 100 * this.prozent;
		if (abweichung <= erlaubteAbweichung) {
			antwortStatus = true;

		}
		return antwortStatus;
	}
}
