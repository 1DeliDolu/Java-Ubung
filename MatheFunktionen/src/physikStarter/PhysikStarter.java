package physikStarter;
import matheFunktionen.MatheApp;

public class PhysikStarter {
	static void wiederStand() {
		
		int spannung = MatheApp.zahlenEinlesen();
		int strom=MatheApp.zahlenEinlesen();
		int wiederstand= spannung/strom;
		System.out.println("Wiederstand : "+wiederstand);
	}
		
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			wiederStand();
	}

}
