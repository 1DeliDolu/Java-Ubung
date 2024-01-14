package javaConstructors;

public class Main {
	int modelYear;
	  String modelName;

	

	  public Main() {
		super();
		this.modelYear = modelYear;
		this.modelName = modelName;
	}



	public static void main(String[] args) {
	    Main myCar = new Main();
	    myCar.modelName="Ferrari";
	    myCar.modelYear=1990;
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	    Main myCar1 = new Main();
	    myCar1.modelName="Ford";
	    System.out.println("before  Name is changed");
	    myCar1.modelYear=1995;
	    System.out.println(myCar1.modelYear + " " + myCar1.modelName);
	    //before  Name is changed
	    System.out.println("after  Name is changed");
	    myCar1.setModelName("Fiat");
	    System.out.println(myCar1.modelYear + " " + myCar1.modelName);
	    
	    
	  }



	public int getModelYear() {
		return modelYear;
	}



	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}



	public String getModelName() {
		return modelName;
	}



	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	}
