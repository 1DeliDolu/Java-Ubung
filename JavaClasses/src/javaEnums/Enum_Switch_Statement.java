package javaEnums;

enum LevelL {
	  LOW,
	  MEDIUM,
	  HIGH
	}

	public class Enum_Switch_Statement {
	  public static void main(String[] args) {
	    LevelL myVar = LevelL.MEDIUM;

	    switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }
	  }
	}