package methodScope;

public class Main {
	//globale Variable
	static int x;
	static String name;
	static float myNumm;
	static double myNum; 
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code here CANNOT use x
		System.out.println("X(int) stammt aus globen Variable: "+x);
		System.out.println("name(String) stammt aus globen Variable: "+name);
		System.out.println("myNumm(float) stammt aus globen Variable: "+myNumm);
		System.out.println("myNum(double) stammt aus globen Variable: "+myNum);
	   
		//lokale Variable
		int x=100;
	    String name="Mustafa";
	    // Code here can use x
	    System.out.println("\nX stammt aus lokalen Variable: "+x);
	    System.out.println("name stammt aus lokalen Variable: "+name);
	}

}
