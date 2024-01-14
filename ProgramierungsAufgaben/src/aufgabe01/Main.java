package aufgabe01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Gebe \"n\" ein:");
		int arrayLange=sc.nextInt();
		sc.nextLine();
		System.out.println("Primzahle: "+Primzahlen.UmwandelString(arrayLange));
		
		Primfaktorzerlegung.factorize(arrayLange);
	}

	

}
