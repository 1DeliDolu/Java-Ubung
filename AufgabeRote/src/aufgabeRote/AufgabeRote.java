package aufgabeRote;

import java.util.Scanner;

public class AufgabeRote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Stromstärkenberechnung Version:");
		double version = sc.nextDouble();
		
		System.out.println("Bitte gebe die Spannung (in Volt) ein : ");
		double volt = sc.nextDouble();
		
		System.out.println("Bitte gebe den Wiederstand (in Ohn) ein : ");
		double wiederStand = sc.nextDouble();
		
		System.out.println("Stromstärkenberechnung Version "+ version); 
		System.out.println("Die Spannung (in Volt): "+  volt);
		System.out.println("Der Wiederstand (in Ohm): "  + wiederStand);
		System.out.println("Die Stromstärke: "+ volt/wiederStand );
	}

}
