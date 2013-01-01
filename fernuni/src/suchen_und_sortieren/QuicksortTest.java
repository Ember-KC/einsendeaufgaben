package suchen_und_sortieren;

import junit.framework.TestCase;

import org.junit.Test;

public class QuicksortTest extends TestCase {

	@Test
	public void testQuicksort() {
		Quicksort qs = new Quicksort();
		int[] testfeld = { 12, 2, 6, 1, 8, 34, 10, 7, 20 };
		qs.quicksort(testfeld, 0, 8);
		int index10 = 1;
		for (int i = 0; i < testfeld.length; i++) {
			if (testfeld[i] == 10) {
				index10 = i;
				break;

			}
		}
		assertEquals(5, index10);
	}
}
