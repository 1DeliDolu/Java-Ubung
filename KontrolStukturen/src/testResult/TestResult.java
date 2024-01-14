package testResult;

import java.util.Scanner;

public class TestResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner testResultat = new Scanner(System.in);
		System.out.print("Bitte gebe bitte  Note  ein : ");
		
		int note = testResultat.nextInt();
		if (0<note && 10>=note) {
			switch(note){
		
			case 10: System.out.println("Ergebnis: Sehr gut");
			break; 
		
			case 9: System.out.println("Ergebnis: Gut");
			break; 
		
			case 8: System.out.println("Ergebnis: Befriedigend");
			break; 
		
			case 7: System.out.println("Ergebnis: Ausreichend");
			break; 
			}
			
		}else System.out.println("FEHLER: Ungültige Punktzahl");
	}

}
