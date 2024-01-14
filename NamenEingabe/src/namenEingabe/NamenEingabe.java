package namenEingabe;

import java.util.Scanner;

public class NamenEingabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Geben Sie bitte den Vormane: ");
		String name = sc.nextLine();
		
		System.out.println("Geben Sie bitte den nachname: ");
		String nachName = sc.nextLine();
		
		System.out.println("Geben Sie bitte die Älte:  ");
		int alter= sc.nextInt(); 
		System.out.println("Hallo Herr " + nachName + "! Sie sind " + name + " " + nachName + " und " + alter +" Jahre alt.");
	}

}
