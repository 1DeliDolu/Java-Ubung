import java.util.Scanner;

public class Standort {
static Scanner scanner=new Scanner(System.in);
	Adresse adresse;
	String stadt;
	
	public Standort() {
		super();
		this.adresse = adresse;
		this.stadt = stadt;
	}
	public  String standort() {
		Adresse a=new Adresse();
		
			this.adresse = a.adresse();
			System.out.print("Stadt:");
			this.stadt = scanner.nextLine();
	        
	        return stadt;
	    }
	}
	
		

