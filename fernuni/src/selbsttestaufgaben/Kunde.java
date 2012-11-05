package selbsttestaufgaben;

class Kunde {
	// Attribute für Kunde
	String name;
	String anschrift;

	// Konstruktor
	Kunde(String neuerName, String neueAnschrift) {
		this.name = neuerName;
		this.anschrift = neueAnschrift;
	}

	// Methoden
	void legeNameFest(final String neuerName) {
		this.name = neuerName;
	}

	void legeAnschriftFest(final String neueAnschrift) {
		this.anschrift = neueAnschrift;
	}

	String liefereName() {
		return name;
	}

	String liefereAnschrift() {
		return anschrift;
	}
}