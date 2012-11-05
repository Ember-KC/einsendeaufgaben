package selbsttestaufgaben;

class Kunde {
	// Attribute f�r Kunde
	String name;
	String anschrift;

	// Konstruktor für Kunde
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