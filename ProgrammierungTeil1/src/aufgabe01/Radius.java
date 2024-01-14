package aufgabe01;

import java.util.Scanner;

public class Radius {
public static void main(String[] args) {
	System.out.println(radius());
}
public static float radius() {
	Scanner scanner=new Scanner(System.in);
	float F;
	Double pi=3.14;
	System.out.print("Gebe Radius ein: ");
	float radius=scanner.nextInt();
	scanner.nextLine();	
	
	return F=(float) (radius*radius*pi);
	
	
}
}
