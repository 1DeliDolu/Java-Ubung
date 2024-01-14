package methods;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAnlegen {

		static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
		
			//String namen= ausgabeArray();
			
			System.out.println(ausgabeArray());
		
		
	}
	
	/*
	 *1. Sichbarkeit
	 *private
	 *public
	 *protected
	 *(keine Angabe)
	 */
		private static  String[] namenSperichern() {
			System.out.print("Gebe bitte die Arraylange ein: ");
			int arrayLange=sc.nextInt();
			sc.nextLine();
			
			String[] namen=new String[arrayLange];
			
			for(int i=0; i < namen.length; i++) {
				if(namen[i] == null) { 
				System.out.print("Namen eingeben: ");
				namen[i] = sc.nextLine();
				}
				
				else {
					System.out.println("stelle besetzt" + namen[i]);
				}
		
		}
			return namen; 
		}
		private static String ausgabeArray() {
			//String[] namen=namenSperichern();
			return Arrays.toString(namenSperichern());
		}

}
