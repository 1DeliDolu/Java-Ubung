package AufgabeTeil2D;

public class StarterAufgabe02 {

	
	 public static void main(String[] args) {
	      
	        Aufgabe02 student1 = new Aufgabe02("Max Mustermann");
	        Aufgabe02 student2 = new Aufgabe02("Anna Beispiel");

	        

	        student1.addScheine(1);
	       
	        student2.addScheine(3);
	        student2.addScheine(3);
	        Aufgabe02.setMindScheine(10);

	        System.out.println(student1);
	        System.out.println(student2);
	    }
}
