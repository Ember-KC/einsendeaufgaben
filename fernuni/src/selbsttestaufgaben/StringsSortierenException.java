package selbsttestaufgaben;

import java.util.Scanner;

public class StringsSortierenException {

	public static void main(String[] args) {
		stringsAufnehmen();
		
		}
	
	public static void stringsAufnehmen() {
		try {
			System.out.println("String 1: ");
			Scanner scan = new Scanner(System.in);
			String [] stringArray = new String [1];
			stringArray[0] = scan.nextLine();
			System.out.println("String 2:");
			stringArray[1] = scan.nextLine(); 
			System.out.println("String 3:");
			stringArray[2] = scan.nextLine();
			
		}
		catch (Exception e) {
			System.out.println("Das Array ist leider zu klein!");
		}
		
	}

	}



