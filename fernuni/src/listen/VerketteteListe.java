package listen;

public class VerketteteListe {
	
	

	    private ListNode head;

	    public VerketteteListe() {
	        this.head = null;
	    }

	    public void add(int value) {
	        ListNode newNode = new ListNode(value, this.head);
	        this.head = newNode;
	    }
	
	
	public int size() {
		int count = 0;
		
		 ListNode current = this.head;
	        for (int i =0; current != null;i++) {
	            count++;
	            current = current.getNext();
	        }
	        return count;
		
	}
	
	public int sumIterativ() {
		int summe = 0;
		ListNode current = this.head;
        while (current != null) {
           summe = summe + current.getEntry();
           current = current.getNext();
            }
        
      return summe;
		
	}
}


