package listen;

import junit.framework.TestCase;

import org.junit.Test;

public class VerketteteListeTest extends TestCase {

	@Test
	public void testVerketteteListe1() {
		VerketteteListe liste = new VerketteteListe(); 
	    liste.add(47);                       
	    liste.add(11);      
	    int ergebnis = liste.size();
	    assertEquals(2, ergebnis);
	}
	
	public void testVerketteteListe2() {
		VerketteteListe liste = new VerketteteListe(); 
	    liste.add(47);                       
	    liste.add(11);    
	    liste.add(15); 
	    liste.add(18); 
	    int ergebnis = liste.size();
	    assertEquals(4, ergebnis);
	}
	
	public void testListenSummeIterativ1() {
		VerketteteListe liste = new VerketteteListe(); 
	    liste.add(47);                       
	    liste.add(11);    
	    liste.add(15); 
	    liste.add(18); 
	    int ergebnis = liste.sumIterativ();
	    assertEquals(91, ergebnis);
		
		
	}
	
	public void testListenSummeIterativ2() {
		VerketteteListe liste = new VerketteteListe(); 
	    liste.add(47);                       
	    liste.add(11);    
	    int ergebnis = liste.sumIterativ();
	    assertEquals(58, ergebnis);
		
		
	}

}
