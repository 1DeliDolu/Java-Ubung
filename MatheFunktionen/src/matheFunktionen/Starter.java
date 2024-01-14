package matheFunktionen;

import java.util.Scanner;

public class Starter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("gebe bitte eine Zahl ein: ");
		int x=scanner.nextInt();
		scanner.nextLine();
		System.out.println("gebe bitte eine Zahl ein: ");
		int y=scanner.nextInt();
		scanner.nextLine();
		System.out.println("gebe bitte eine Zahl ein: ");
		int z=scanner.nextInt();
System.out.println(MatheApp.max_3(x, y, z));
	
	}

}
