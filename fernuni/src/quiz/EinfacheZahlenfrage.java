package quiz;

public class EinfacheZahlenfrage extends AbstrakteZahlenfrage {

	private int richtigeAntwort;

	public EinfacheZahlenfrage(String frage, int punkte, int richtigeAntwort) {
		super(frage, punkte);
		this.richtigeAntwort = richtigeAntwort;
		// TODO Auto-generated constructor stub
	}

	public boolean istRichtigBeantwortet() {
		boolean antwortStatus = false;
		if (this.antwort == richtigeAntwort) {
			antwortStatus = true;
		}
		return antwortStatus;
	}
}
