package monster;

import java.util.Arrays;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		private String farbe;
		private int autoNummer;
		private Fahrer fahrer;
		 
		private Boolean horn;
		private int mundZahl;
		private String farbe;
		private Boolean ohren;
		private int arm;
		private int helm;*/

		Fahrer f1= new Fahrer(true, 2, "blau",true,0,3);	
		Auto a1=new Auto("gelbe",f1);

		
		//Am 05.01.24 haben wir geschrieben.
//f1.setHorn(true);
//f1.setMundZahl(2);
//f1.setFarbe("Blaue");
//f1.setOhren(false);
//f1.setArm(false);
//f1.setHelm(3);
//a1.setFarbe("gold");
//a1.setAutoNummer(37);
//a1.setFahrer(f1);
		
		/*
		private String farbe;
		private int autoNummer;
		private Fahrer fahrer;
		 
		private Boolean horn;
		private int mundZahl;
		private String farbe;
		private Boolean ohren;
		private int arm;
		private int helm;*/
		Fahrer f2= new Fahrer(true, 1, "hellblau",false,2,1);	
		Auto a2=new Auto("grün",f2);
		//absicht habe ich falssche afrebe eingegeben.


		Fahrer f3= new Fahrer(false, 1, "pink",false,0,0);	
		Auto a3=new Auto("turkuaz",f3);

		Fahrer f4= new Fahrer(false, 1, "gelb",true,2,0);	
		Auto a4=new Auto("hellblau",f2);
//	
//System.out.println(a4);
Auto[] auto=new Auto[4];
auto[0]=a1;
auto[1]=a2;
//System.out.println(auto[1]);
auto[1].setFarbe("rote");
//System.out.println(auto[1]+"\n");
auto[2]=a3;
auto[3]=a4;
for(int i=0;i<auto.length;i++) {
	//System.out.println((i+1)+"."+auto[i]);
}
//System.out.println(f1);
System.out.println(Arrays.toString(Auto.speichern()));
a4.speichern();
	}

}