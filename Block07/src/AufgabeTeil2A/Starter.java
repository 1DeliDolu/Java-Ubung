package AufgabeTeil2A;

import java.util.Arrays;

public class Starter {
	
	
	public static void main(String [] args) {
		Aufgabe01 a1=new Aufgabe01('m',"Mustafa Özdemir");
		
		
		Aufgabe01 a2=new Aufgabe01('w',"Elif Özdemir");
		Aufgabe01.student[0]=a1;
		Aufgabe01.student[1]=a2;
	System.out.println(a1+" "+a2);
	}
}
