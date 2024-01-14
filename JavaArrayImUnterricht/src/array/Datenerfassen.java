package array;

import java.util.Scanner;

public class Datenerfassen {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Hallo! Gebe bitte deine Array_Länge ein: ");
		int x=sc.nextInt();
		String [] namen= new String[x];
		sc.nextLine();
		for(int i=0;i<namen.length;i++) {
			System.out.println("Hallo! Gebe bitte deinen Name ein: ");
			String name=sc.nextLine();
			namen[i]=name;
			
			
		}
		for(int i=0;i<namen.length;i++) {
		
			System.out.println(namen[i]);
	}}

}
