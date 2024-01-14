package aufgabe05;

import java.util.Random;
import java.util.Scanner;

public class Würfeln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
würfeln();
	}
public static int würfeln() {
	Random random = new Random();
	Scanner scanner=new Scanner(System.in);
	//int randomZahl = random.nextInt(6) + 1;
	int randomZahl;
	boolean schleife=true;
	int zähler=0;
	int zähler1=0;
	while(schleife) {
	//randomZahl = random.nextInt(6) + 1;
		System.out.print("Gebe bitte eine Zahl von 1 bis 6 ein:");
		randomZahl =scanner.nextInt();
		scanner.nextLine();
		if((randomZahl<0)||(randomZahl>6)) {
			System.out.println("Die Zahl muss von 1 bis 6 sein");
			zähler1++;
			System.out.println("Die Zahl wird "+zähler1+" Mal falsch eingegeben" );
		}
		zähler++;
	if(randomZahl==6) {
		System.out.println("Counter: "+zähler);
		schleife=false;
	}
	/*
	 * else if(zähler==100) {
		System.out.println("Counter: "+zähler+" "+randomZahl);
		schleife=false;
	}
	*/
	}
	return zähler;

	}
}
