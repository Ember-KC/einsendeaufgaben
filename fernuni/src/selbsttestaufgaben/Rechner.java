package selbsttestaufgaben;

public class Rechner {
	public int berechne(int x, int y) {
		int erg = 0;
		if (x < 0) {
			x *= -1;
		}
		if (y < 0) {
			y *= -1;
		}
		erg = x * y;
		return erg;
	}
}