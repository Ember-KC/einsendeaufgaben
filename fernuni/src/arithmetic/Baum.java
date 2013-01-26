package arithmetic;

public class Baum {

	private Knoten wurzel;

	public Baum(Knoten wurzel) {
		this.wurzel = wurzel;
	}

	public Object liefereWurzel() {
		return this.wurzel;
	}

	public int werteAus() {
		return wurzel.werteAus();
	}

	public static Baum erzeugeBeispielBaum(int i, int j, int k, int l, int m) {
		IntKnoten int1 = new IntKnoten(i);
		IntKnoten int2 = new IntKnoten(j);
		IntKnoten int3 = new IntKnoten(k);
		IntKnoten int4 = new IntKnoten(l);
		IntKnoten int5 = new IntKnoten(m);
		MultKnoten mult1 = new MultKnoten(int1, int2);
		SubKnoten sub1 = new SubKnoten(int4, int5);
		DivKnoten div1 = new DivKnoten(int3, sub1);
		AddKnoten add1 = new AddKnoten(mult1, div1);
		Baum baum = new Baum(add1);
		return baum;
	}

	public String toString() {
		return wurzel.toString();

	}

}
