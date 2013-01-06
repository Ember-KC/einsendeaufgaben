package rekursion;

public class SummeRekursiv {
	
	public int berechneSummeUngeraderZahlen(int n) {
		
		//Basisfall: Zahl ist 1 (kleinste positive ungerade Zahl)
		if (n <=1 ) {
			return 0;
		}			
				
		//Zahl mit Modulo durch 2 teilen und prüfen, ob Rest übrig bleibt
		//wenn Rest übrig bleibt, ist n ungerade und wird addiert	
		//wenn kein Rest übrig bleibt, dann n-- und erneut mit Modulo durch 2 teilen
	
		for (int i=n; n>1; i--) {			
					
			int zahl = n%2;
			
			//wenn es bei der Moduloteilung einen Rest gibt, wird die Schleife verlassen und die Methode mit n ausgeführt
			if (zahl > 0) {
				break;				
			}
			
			//wenn es bei der Moduloteilung keinen Rest gibt, wird n dekrementiert und die Schleife erneut durchlaufen
			n--;
		}
		// Methode wird erneut mit dem dekremierten n + n aufgerufen		
		return berechneSummeUngeraderZahlen(n-1) +n;
		
	}
	
	
	
	public int berechneSummeGeraderZahlen(int n) {
		//Basisfall: Zahl ist 2 (kleinste positive ungerade Zahl)
		if (n <=2 ) {
			return 0;
		}			
				
		//Zahl mit Modulo durch 2 teilen und prüfen, ob Rest übrig bleibt
		//wenn kein Rest übrig bleibt, ist n gerade und wird addiert	
		//wenn Rest übrig bleibt, dann n-- und erneut mit Modulo durch 2 teilen
	
		for (int i=n; n>1; i--) {			
					
			int zahl = n%2;
			
			//wenn kein Rest übrig bleibt, wird die Schleife verlassen und die Methode mit der Zahl ausgeführt
			if (zahl == 0) {
				break;				
			}
			//wenn ein Rest übrig bleibt, wird n dekrementiert und die Schleife erneut durchlaufen
			n--;
		}
		// Methode wird erneut mit dem dekremierten n + n aufgerufen
		return berechneSummeGeraderZahlen(n-1) +n;
		
	}
	
	
}

