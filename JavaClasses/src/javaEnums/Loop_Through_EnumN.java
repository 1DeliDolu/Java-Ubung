package javaEnums;



	public class Loop_Through_EnumN {
		enum LeVeLL {
			  LOW,
			  MEDIUM,
			  HIGH
			}

	  public static void main(String[] args) { 
	    for (LeVeLL myVar : LeVeLL.values()) {
	      System.out.println(myVar);
	    }
	  } 
	}
