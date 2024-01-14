package AufgabeTeil3;

	public class Handy {
		 
		  private int nummer;
		  private String besitzer;
		  private Konto konto;
		  private String sendSMS;//ich habe diese Zeile selbst gescrieben
		  private String empfängSMS;
		  //private static int zählerSMS=1; ich habe selbst gescrieben
		  /*
		   * Variable sendSMS und empfängSMS habe ich selbst umgewandelt ansttat Variable LetzteSMS.Nur möchte wissen. welche SMS jemand geshickt und erhalten hat.
		  */
		  

		
		  public Handy(int neueNummer, Konto bankKonto) {
		    this.nummer = neueNummer;
		    this.konto = bankKonto;
		    this.besitzer = konto.getInhaber(); 
		    this.sendSMS = ""; 
		    this.empfängSMS="";
		    //zählerSMS++;
		  }

		  /*
		   * durch dieses Method kann man SMS schicken*/
		  public void sendeSMS(Handy empfänger, String text) {
			  this.sendSMS=text;
			  empfänger.empfängSMS = text; 
			  this.konto.abheben(1); 
			 
		  }

		  
		  public String leseSMS() {
		    return empfängSMS;
		  }

		/*
		 * hier habe ich letzteSMS durch empfängSMS und sendSMS umgesetzt.
		 * */
		  public void druckeSMS() {
		    System.out.println("Letzte SMS: " + empfängSMS+" " + sendSMS);
		  }

		@Override
		public String toString() {
			return "Handy [nummer="+nummer+", besitzer="+besitzer+", "+ "sendeSMS="+sendSMS+", empfängSMS="+ empfängSMS +"]";
		}
		
	} 
		  
		  
		