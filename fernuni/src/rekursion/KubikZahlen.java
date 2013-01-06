package rekursion;

public class KubikZahlen {
	
public int berechneSummeKubikZahlenRekursiv(int n){
	
	if (n<=1) {
		return 1;
	}
	
	int kubikzahl = n * n * n;	
		
		return berechneSummeKubikZahlenRekursiv(n-1)+kubikzahl;

	}

public int berechneSummeKubikZahlenIterativ(int n) {
	int kubikzahl = 0;
	for (int i=n; i>0; i--){
		kubikzahl = kubikzahl + (i*i*i);
	}	
	return kubikzahl;
}

}
