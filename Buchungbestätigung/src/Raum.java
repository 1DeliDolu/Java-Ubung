import java.util.Scanner;

public class Raum {
	static Scanner scanner=new Scanner(System.in);
	int raumnummer;
	String art;
	public Raum() {
		super();
		this.raumnummer = raumnummer;
		this.art = art;
	}
	public String raum() {
		System.out.println("Raumnummer: ");
		int raumnummer=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Raumart: ");
		String art=scanner.nextLine();
		return raumnummer+" "+art;
	}
	}

