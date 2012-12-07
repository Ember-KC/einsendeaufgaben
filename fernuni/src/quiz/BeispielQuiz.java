package quiz;

import java.util.Scanner;

public class BeispielQuiz {

	public static void main(String[] args) {
		Quiz q = new Quiz(4);
		q.fuegeFrageHinzu(new EinfacheZahlenfrage("Was ist 2*20?", 2, 40));
		q.fuegeFrageHinzu(new SchaetzFrage(
				"Wie hoch ist der Koelner Dom ungefaehr?", 5, 157, 5));
		q.fuegeFrageHinzu(new EinfacheZahlenfrage("Was ist 2+5?", 1, 7));
		q.fuegeFrageHinzu(new SchaetzFrage(
				"Wie lange ist der Aequator ungefaehr?", 5, 40075, 5));
		BeispielQuiz.start(q);
	}

	public static void start(Quiz q) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < q.liefereFragenAnzahl(); i++) {
			Zahlenfrage f = q.liefereFrage(i);
			System.out.println(f.liefereFrage());
			System.out.println("(" + f.liefereMoeglichePunkte() + " Punkte)");
			int antwort;
			while (!f.istBeantwortet())
				if (s.hasNextInt()) {
					antwort = s.nextInt();
					f.legeAntwortFest(antwort);
				} else {
					s.next();
					System.out.println("Geben Sie bitte eine Zahl an.");
				}

			System.out.print("Ihre Antwort war ");
			if (f.istRichtigBeantwortet()) {
				System.out.println("richtig.");
			} else {
				System.out.println("falsch.");
			}
		}

		System.out.println("Insgesamt wurden " + q.berechneErreichtePunkte()
				+ " / " + q.berechneMaximalMoeglichePunkte()
				+ " Punkten erreicht.");
		s.close();

	}

}
