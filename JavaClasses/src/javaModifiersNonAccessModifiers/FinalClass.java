package javaModifiersNonAccessModifiers;

public class FinalClass {
	protected String brand = "Ford";
	  public void honk() {
	    System.out.println("Tuut, tuut!");
	  }
	}

	class Main extends FinalClass{
	  private String modelName = "Mustang";
	  public static void main(String[] args) {
		  Main myFastCar = new Main();
	    myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	  }
	}
