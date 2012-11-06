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
	void setName(final String neuerName) {
		this.name = neuerName;
	}

	void setAnschrift(final String neueAnschrift) {
		this.anschrift = neueAnschrift;
	}

	String getName() {
		return name;
	}

	String getAnschrift() {
		return anschrift;
	}
}