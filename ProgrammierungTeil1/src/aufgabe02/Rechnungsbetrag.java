package aufgabe02;

import java.util.Scanner;

public class Rechnungsbetrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Rechnungsbetrag: "+rabatt());
	}
public static float rabatt() {
	System.out.print("Gebe bitte den Umsatz ein: ");
	Scanner scanner= new Scanner(System.in);
	float Umsatz=scanner.nextInt();
	scanner.nextLine();
	
	if(Umsatz>500) {
		Umsatz*=0.90;
		
		
	}
	else if(Umsatz>100) {
		Umsatz*=0.95;
	}
	else if(Umsatz<100) {
		
	}
		
	return Umsatz; 
}
}
