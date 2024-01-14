package javaArraysDefinition;

public class AccessTheElementsOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		    
		 /*System.out.println(cars[0]);
		    System.out.println(cars[1]);
		    System.out.println(cars[2]);
		    System.out.println(cars[3]);
		    System.out.println("=====");
		    */
		    for(int i=0;i<cars.length;i++) {
		    	System.out.print(cars[i]+" ");
		    }
		    System.out.println("\n=====");
		    
		    cars[0]="Opel";
		    
		    for(int i=0;i<cars.length;i++) {
		    	System.out.print(cars[i]+" ");
	}

}}
