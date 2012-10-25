package selbsttestaufgaben;

class Rechnung {

	double betrag;
	double rabatt;
	Kunde rechnungsempfaenger;
	
	public static void main(String[] args) {
		String annasName = new String("Anna Müller");
		String annasAnschrift = "Mühlenweg 2, 12345 Irgendwo";
		Kunde kunde1 = new Kunde(annasName, annasAnschrift);
		Rechnung rechnung6 = new Rechnung();
		rechnung6.rechnungsempfaenger = kunde1;
		rechnung6.fuegePostenHinzu(25, 1.76);
		rechnung6.legeRabattFest(0.04);
		rechnung6.gebeAus();
	}
	
	double legeMehrwertsteuerFest(double nettopreis, double mwstSatz) {
		double bruttopreis = 0;
		bruttopreis = nettopreis * mwstSatz;		
		return bruttopreis;
	}
	
	void fuegePostenHinzu(int anzahl, double einzelpreis) {
		this.betrag += anzahl * einzelpreis;
	}
	
	void legeRabattFest(final double neuerRabatt) {
		this.rabatt = neuerRabatt;
	}
	
	void legeRechnungsempfaengerFest(Kunde empfaenger) {
		this.rechnungsempfaenger = empfaenger;
	}
	
	double liefereRabatt() {
		return this.rabatt;
	}
	
	Kunde liefereRechnungsempfaenger() {
		return this.rechnungsempfaenger;
	}
	
	double berechneNettopreis() {
		return this.betrag * (1 - this.liefereRabatt());
	}
	
	void gebeAus() {
		System.out.println("An:");
		System.out.println(this.liefereRechnungsempfaenger().
				liefereName());
		System.out.println(this.liefereRechnungsempfaenger().
				liefereAnschrift());
		System.out.print("Netto: ");
		System.out.println(this.berechneNettopreis());
	}
	

}