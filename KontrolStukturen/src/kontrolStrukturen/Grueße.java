package kontrolStrukturen;

import java.util.Scanner;

public class Grueße {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner einGabe = new Scanner(System.in);
		
		System.out.print("Bitte gebe bitte den Name  ein : ");
		String name = einGabe.nextLine();
		
		System.out.print("Bitte gebe bitte die Geschlecht  ein : ");
		String geschlecht = einGabe.nextLine();
		
		System.out.print("Bitte gebe bitte die Uhr  ein : ");
		int uhr = einGabe.nextInt();
	
		if (0<uhr && uhr<=9) {
			if(geschlecht=="w") System.out.println(" Guten Morgen Frau "+ name);
			else System.out.println(" Guten Morgen Herr "+ name);
		}
		else if(10<=uhr && uhr<18 ) {
			if (geschlecht=="w") System.out.println(" Guten Morgen Frau "+ name);
			else System.out.println(" Guten Morgen Herr "+ name);
		}
		else {
			if (geschlecht=="w") System.out.println(" Guten Morgen Frau "+ name);
			else System.out.println(" Guten Morgen Herr "+ name);
	}
	}

}
