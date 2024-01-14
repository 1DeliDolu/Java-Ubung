package javaEnums;

//Java program to demonstrate that enums can have
//constructor and concrete methods.

//An enum (Note enum keyword inplace of class keyword)
enum CoLoRR {
	RED,
	GREEN,
	BLUE;

	// enum constructor called separately for each
	// constant
	private CoLoRR()
	{
		System.out.println("Constructor called for : "
						+ this.toString());
	}

	public void colorInfo()
	{
		System.out.println("Universal Color");
	}
}

public class TestENUM {
	// Driver method
	public static void main(String[] args)
	{
		CoLoRR c1 = CoLoRR.RED;
		CoLoRR c2 = CoLoRR.BLUE;
		System.out.println(c1);
		
		System.out.println("\n"+c2);
		System.out.print("c1.colorInfo():");
		//c1.colorInfo();
	}
}
