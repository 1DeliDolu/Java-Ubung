package einkommenSteuer;

import java.util.Scanner;

public class EinkommenSteuer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte gebe  die Einkommen  ein : ");
		
		double einKommen=sc.nextDouble();
		
		System.out.print("Bitte gebe  den Familiestand Buchstabe l für Ledige oder  h für Verheiretete ein : ");
		
		String familieStand=sc.nextLine();
		if (familieStand="l"&&(0<einKommen&&einKommen<=9275) {
			System.out.println("Stueersatz: 10%");
		}
		else if (familieStand="m" && 0<einKommen && einKommen<=18550) {
			System.out.println("Stueersatz: 10%");
	}

}
