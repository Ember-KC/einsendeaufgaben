package baeume;

public class TernaererBaumMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TernaererKnoten k1 = new TernaererKnoten(null, null, null, 4);
		TernaererKnoten k2 = new TernaererKnoten(null, null, k1, 1);
		TernaererKnoten k3 = new TernaererKnoten(null, null, null, 0);
		TernaererKnoten k4 = new TernaererKnoten(null, null, null, 9);
		TernaererKnoten k5 = new TernaererKnoten(k4, k3, k2, 2);
		TernaererKnoten k6 = new TernaererKnoten(null, null, null, 7);
		TernaererKnoten k7 = new TernaererKnoten(null, null, null, 6);
		TernaererKnoten k8 = new TernaererKnoten(null, null, null, 8);
		TernaererKnoten k9 = new TernaererKnoten(k7, null, k8, 3);
		TernaererKnoten k10 = new TernaererKnoten(k5, k6, k9, 5);
		TernaererBaum baum = new TernaererBaum(k10);
		System.out.println(baum.istEnthalten(18));
		System.out.println(baum.lieferWurzel());
	}

}
