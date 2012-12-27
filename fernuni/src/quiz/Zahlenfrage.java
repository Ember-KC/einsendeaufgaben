package quiz;

public interface Zahlenfrage {

	// liefert true wenn die Methode legeAntwortFest() schon mindestens einmal
	// ausgeführt wurde, ansonsten false

	public boolean istBeantwortet();

	// liefert true wenn die Frage schon beantwortet wurde und die Antwort
	// richtig war, ansonsten false

	public boolean istRichtigBeantwortet();

	/**
	 * legt die Antwort auf diese Frage fest
	 * 
	 * @param antwort
	 */

	public void legeAntwortFest(int antwort);

	// liefert die Anzahl der erreichten Punkte, abhängig von der Korrektheit
	// der Antwort

	public int liefereErreichtePunkte();

	// liefert den Fragetext der Aufgabe

	public String liefereFrage();

	// liefert die maximal mögliche Anzahl an erreichbaren Punkten

	public int liefereMoeglichePunkte();

	public int getPunkte();

}
