package javaEnums;



	public class Loop_Through_Enum { 
		enum LeVeL {
			  LOW,
			  MEDIUM,
			  HIGH
			}
	  public static void main(String[] args) { 
	    for (LeVeL myVar : LeVeL.values()) {
	      System.out.println(myVar);
	    }
	  } 
	}
