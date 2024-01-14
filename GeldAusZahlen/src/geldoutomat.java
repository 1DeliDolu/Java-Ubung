 
import java.util.Scanner;
 
public class geldoutomat {
 // von Jürgen 
	
	// sk    status geldautomat  x=an other=aus
	// kl    karte  lesbar       x=an other=aus
	// pc    pin code            v=versuch o=o.k. g=gesperrt
	// vs    versuchzähler
	
	public static void main(String[] args) {
	
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Huhu, ich bin dein Geldautomat ");
			System.out.print("Status eingeschaltet [x] Status ausgeschaltet [sonstige Taste] :");
			String sk = sc.nextLine();
			
				while (sk.equals ("x"))
				{
				System.out.println("Die Lesbarkeit deiner Karte wird nun geprüft ");
				System.out.print("Karte lesbar [x] Karte nicht lesbar [sonstige Taste': ");
				String kl = sc.nextLine();
						if (!kl.equals ("x"))
						{
						System.out.println("Deine Karte ist total versifft und deshalb nicht lesbar ");
						System.out.println("Einfach sauber machen oder für schlappe 20 Eur eine Neue bestellen ");
						
						
						
						int vs = 1 ;
						String pc = "v";
						while (pc.equals ("v") && kl.equals("x"))
						{
						System.out.println("Bitte PIN eingeben ");
						int pin = sc.nextInt();
						if (pin == 1234 )
							{
							System.out.println("Super, du hast dich erfolgreich legitimiert ");
							pc = "o";							
							}
							else
							{
							System.out.println("Du hohle Nuss kannst du dir nicht deine Pin merken ");
							vs++;
								if (vs > 3)
								{
								pc = "g";
								System.out.println("PIN 3 Mal falsch, Karte wird ausgegeben ");
								}
							}
						 }
							
								while (pc.equals ("o"))
								{
								System.out.println("Super, du kannst nun Geld abheben ");
								break;
								};
								sc.nextLine();
			System.out.println("Kartenausgabe erfolgt");					
			System.out.println("Status eingeschaltet [x] Status ausgeschaltet [sonstige Taste]");
			 sk = sc.nextLine();
				}
	}
}
}