package rekursion;

import junit.framework.TestCase;

import org.junit.Test;

public class SummeRekursivTest extends TestCase {

	@Test
	public void testBerechneSummeUngeraderZahlen1() {
		SummeRekursiv sr = new SummeRekursiv();
		int ergebnis = sr.berechneSummeUngeraderZahlen(4);
		assertEquals(4, ergebnis);
	}
	
	@Test
	public void testBerechneSummeUngeraderZahlen2() {
		SummeRekursiv sr = new SummeRekursiv();
		int ergebnis = sr.berechneSummeUngeraderZahlen(6);
		assertEquals(9, ergebnis);
	}
	
	@Test
	public void testBerechneSummeUngeraderZahlen3() {
		SummeRekursiv sr = new SummeRekursiv();
		int ergebnis = sr.berechneSummeUngeraderZahlen(0);
		assertEquals(0, ergebnis);
	}
	
	@Test
	public void testBerechneSummeUngeraderZahlen4() {
		SummeRekursiv sr = new SummeRekursiv();
		int ergebnis = sr.berechneSummeUngeraderZahlen(-6);
		assertEquals(0, ergebnis);
	}
	
	@Test
	public void testBerechneSummeGeraderZahlen1() {
		SummeRekursiv sr = new SummeRekursiv();
		int ergebnis = sr.berechneSummeGeraderZahlen(6);
		assertEquals(12, ergebnis);
	}
	
	@Test
	public void testBerechneSummeGeraderZahlen2() {
		SummeRekursiv sr = new SummeRekursiv();
		int ergebnis = sr.berechneSummeGeraderZahlen(10);
		assertEquals(30, ergebnis);
	}
	
	@Test
	public void testBerechneSummeGeraderZahlen3() {
		SummeRekursiv sr = new SummeRekursiv();
		int ergebnis = sr.berechneSummeGeraderZahlen(0);
		assertEquals(0, ergebnis);
	}
	
	@Test
	public void testBerechneSummeGeraderZahlen4() {
		SummeRekursiv sr = new SummeRekursiv();
		int ergebnis = sr.berechneSummeGeraderZahlen(-5);
		assertEquals(0, ergebnis);
	}

}
