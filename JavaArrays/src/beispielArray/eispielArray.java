package beispielArray;

import java.util.Arrays;
import java.util.Scanner;
public class eispielArray {

	public static void main(String[] args) {
		
		// 02.01.2024
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int [] zahlen_1= {2,4,5,6,7};
		int  zahlen_2[]= {2,4,5,6,7};
		String [] namen= new String[5];
		namen[2]="Liii";
		System.out.print((2+1)+". Name: ");
		namen[3]=sc.nextLine();
		for(int i=0;i<namen.length;i++) {
			System.out.println(namen.length);
			if(namen[i]==null) {
				System.out.print((i+1)+". Name: ");
				namen[i]=sc.nextLine();
			} else {
				System.out.println((i+1)+". Stelle besetzt "+namen[i]);
				namen[i]=null;
			}
		}
		
		for (String element:namen) {
			System.out.println(element);
		}
		System.out.println("durch Arrays.toString(namen)");
		System.out.println(Arrays.toString(namen));
		
		System.out.println("-------");
		 int a = 5;   // binary: 0101  
	        int b = 3;   // binary: 0011  
	        int result = a^b;   // result = 6 (binary: 0110) 
	        int result1 = a&b;	// result =7  / (binary: 0111) 
	        int result2 = a|b;	// result =1  / (binary: 0001)
	       
	        int result3= (a & ~b) | (~a & b);	// result = 6 (binary: 0110) 
	        System.out.println("Result: " + result+" Result1: " + result1+ " Result2: " + result2 + " Result3: " + result3);  
		
	}

}
