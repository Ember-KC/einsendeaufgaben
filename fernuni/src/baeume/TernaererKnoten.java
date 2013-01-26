package baeume;

public class TernaererKnoten {

	private int wert;
	private TernaererKnoten links;
	private TernaererKnoten mitte;
	private TernaererKnoten rechts;

	public TernaererKnoten(TernaererKnoten links, TernaererKnoten mitte,
			TernaererKnoten rechts, int wert) {
		this.links = links;
		this.rechts = rechts;
		this.mitte = mitte;
		this.wert = wert;
	}

	public int liefereWert() {
		return wert;
	}

	public TernaererKnoten liefereLinkenNachfolger() {
		return links;
	}

	public TernaererKnoten liefereMittlerenNachfolger() {
		return mitte;
	}

	public TernaererKnoten liefereRechtenNachfolger() {
		return rechts;
	}

}
