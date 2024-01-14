package pojektarbeit1ForSchleife;

import java.util.Scanner;

public class Projektarbeit1ForSchleife {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
	
		System.out.print("Geben Sie bitte gesammte Punte ein :");
		int SumPukte= scanner.nextInt();
		int tag =1;
       
		// while (tag<= SumTage) {
		int bonuspunkte = 0;
              for (int bonusTage=1; bonusTage<= SumPukte;bonusTage++) {
            	  
            	  //for (int bonusTage=1; bonusTage<=1000;bonusTage++) {
            	  bonuspunkte ++;
            	  if(bonusTage==bonuspunkte) {
            		
            	System.out.println("Ab Tag " + tag + " erhält man pro Einkauf: "+bonuspunkte  + " Bonuspunkte");
            	tag+=bonuspunkte;
            	  }
              else {
            	  
            	  System.out.println("Ab Tag " + tag + " erhält man pro Einkauf: "+bonuspunkte  + " Bonuspunkte");
            	  tag++;
            	  bonuspunkte++;
            	  }}
            	  if (bonuspunkte>=100) {
            		 
            		  System.out.println("Herzlichen Glünkwunsch! Sie haben ein Bonus von uns gewonnnen und Sie haben auch "+(bonuspunkte-100)+" Bonuspunte");
            		  bonuspunkte=0;
            	  }
            	  else { System.out.println("Wir möchten in der Zukuft als Kunden nochmal begrüßen und wenn Sie mehr "+(100-bonuspunkte)+" Punkte hätten, hätten Sie Bonus von uns");
            	  }
	}
       
}

