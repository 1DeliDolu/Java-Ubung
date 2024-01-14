package steuernUSA;

import java.util.Scanner;

public class SteuernUSA {

	public static void main(String[] args) {
		
		Scanner steuerUSA = new Scanner(System.in);
		System.out.print("Gebe bitte dein Einkommen :");
		double bruttoGehalt = steuerUSA.nextDouble();
		System.out.print("Gebe bitte deinen Familienstand :");
        String familienStand = steuerUSA.nextLine();
        double steuer; 
        if ("ledig".equals("familienStand")) {
            switch (bruttoGehalt) {
                case (0<=bruttoGehalt) &&( bruttoGehalt<=18550):
                    steuer = bruttoGehalt * 0.10;
                    break;
                case 18551 <= bruttoGehalt && bruttoGehalt <= 75300:
                    steuer = bruttoGehalt * 0.15;
                    break;
                case 75301 <= bruttoGehalt && bruttoGehalt <= 151900:
                    steuer = bruttoGehalt * 0.25;
                    break;
                case 151901 <= bruttoGehalt && bruttoGehalt <= 231450:
                    steuer = bruttoGehalt * 0.28;
                    break;
                case 231451 <= bruttoGehalt && bruttoGehalt <= 413350:
                    steuer = bruttoGehalt * 0.33;
                    break;
                case 413351 <= bruttoGehalt && bruttoGehalt <= 466950:
                    steuer = bruttoGehalt * 0.35;
                    break;
                default:
                    steuer = bruttoGehalt * 0.39;
                    break;
            }
        } else {
            switch (bruttoGehalt) {
                case 0 <= bruttoGehalt && bruttoGehalt <= 9275:
                    steuer = bruttoGehalt * 0.10;
                    break;
                case 9276 <= bruttoGehalt && bruttoGehalt <= 37650:
                    steuer = bruttoGehalt * 0.15;
                    break;
                case 37651 <= bruttoGehalt && bruttoGehalt <= 91150:
                    steuer = bruttoGehalt * 0.25;
                    break;
                case 91151 <= bruttoGehalt && bruttoGehalt <= 190150:
                    steuer = bruttoGehalt * 0.28;
                    break;
                case 190151 <= bruttoGehalt && bruttoGehalt <= 413350:
                    steuer = bruttoGehalt * 0.33;
                    break;
                default:
                    steuer =bruttoGehalt * 0.39;
                    break;
            }
        }

        System.out.println("Netto-Gehalt: $" + bruttoGehalt-steuer);
	}

}
