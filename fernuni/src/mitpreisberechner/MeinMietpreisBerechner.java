package mitpreisberechner;

public class MeinMietpreisBerechner {

	// Betraege werden alle in Cent angegeben
	final long TAGESPAUSCHALE = 2000;
	final long KILOMETER_UNTER_200 = 4000;
	final long KILOMETER_UEBER_200 = 15;
	final long PAUSCHALE_AB_14 = 30000;
	final long KILOMETER_AB_14TAGE = 12;

	public long berechneMietpreis(int tage, int km)
			throws UngueltigeKilometerangabeAusnahme,
			UngueltigeTagesanzahlAusnahme {
		long mietpreis = 0;

		if (km < 0) {
			throw new UngueltigeKilometerangabeAusnahme();
		} else if (tage <= 0) {
			throw new UngueltigeTagesanzahlAusnahme();
		} else {

			if (tage < 14 && km <= 200) {
				mietpreis = (tage * TAGESPAUSCHALE) + KILOMETER_UNTER_200;

			} else if (tage < 14 && km > 200) {
				mietpreis = (tage * TAGESPAUSCHALE) + KILOMETER_UNTER_200
						+ ((km - 200) * KILOMETER_UEBER_200);

			} else {
				mietpreis = PAUSCHALE_AB_14 + (km * KILOMETER_AB_14TAGE);

			}

		}

		return mietpreis;
	}
}