package aufgabe03;

import java.util.Scanner;

public class Mehrfachauswahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(note());;
	}
public static String note() {
	Scanner scanner= new Scanner(System.in);
	System.out.print("Gebe bitte die Note ein: ");
	int note=scanner.nextInt();
	String Notenwert;
	switch(note) {
	
	case 1:  Notenwert="sehr gut";
	break;
	
	case 2:  Notenwert="gut";
	break;
	
	case 3:  Notenwert="befriedigend";
	break;
	
	case 4:  Notenwert="ausreichend";
	break;
	
	case 5:  Notenwert="mangelhaft";
	break;
	
	case 6:  Notenwert="ungenügeng";
	break;
	default: Notenwert="Fehlermeldung";
	}
	return Notenwert;
}
}
