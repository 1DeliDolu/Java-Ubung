package AufgabenTeil1;

public class JavaInitializers {
	
	public int zahl;
	static int zahll=0;
	static void ausgabe(){

		   System.out.println( "Statischer Initialisierer");

		  }



		  {

		    System.out.println( "\nExemplarinitialisierer" );

		  }



		 JavaInitializers() {

		   System.out.println( "Konstruktor" );
		   zahll++;
		   this.zahl=zahll;
		   System.out.println( zahl );
		   

		  }



		  public static void main( String[] args ) {
			  //JavaInitializers.zahll;
		    System.out.print("ausgabe(): ");
			  ausgabe();
			  new JavaInitializers();
			  JavaInitializers i1= new JavaInitializers();
			  i1.zahl=34;
			  //JavaInitializers.zahll;
			  //new
			  int[] myNum=new int[3];
			  JavaInitializers i2= new JavaInitializers();

		  }

		}

