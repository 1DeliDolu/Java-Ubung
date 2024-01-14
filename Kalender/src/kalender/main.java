package kalender;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OrthodoxenKirchenkalenders.OrthodoxenKirchenkalenders();
		
		Scanner sc = new Scanner(System.in);

		boolean versuch=true;

		while (versuch) {
	    System.out.println("1. Gregorianischer Kalender");
	    System.out.println("2. Orthodoxer Kirchenkalender");
	    System.out.println("0. Programm beenden");
	    System.out.print("Bitte wählen Sie eine Option: ");
	    
	    int eingabe=sc.nextInt();
	
	    if (eingabe == 0) {
	        System.out.println("Programm wird beendet.");
        versuch = false;
        break;
	    }

	    switch (eingabe) {
        case 1:
        	GregorianischenKalenders.gregorianischenKalenders();
            break;
        case 2:
        	OrthodoxenKirchenkalenders.orthodoxenKirchenKalenders();;
            break;
        default:
            System.out.println("Ungültige Auswahl. Bitte erneut versuchen.");
    }
}
}
}

