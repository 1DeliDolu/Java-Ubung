package aufgabeForSchleifen;

public class AufgabeForSchleifen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i, j, k ;
		
		/*k=0;
		for (i=1; i<10; i=i+1) {
		k=k+i;
		}
		System.out.println("Wert von k: " + k);*/
		
		/*k=0;
		for (i=2;i<10; i=i+2) {
			k=k+i;
		}
		System.out.println("Wert von k: " + k);*/
		 
		
		/*k=0;
		for (i=1,j=5; (i<5)&&(j>1); i++, j--) {
		k=k+i*j;
		}
		System.out.println("Wert von k: " + k);
		*/
		/*k=0;
		for (i=1;i<5; i++)
			if (i==3) {
			continue;
		
			}
			else
			k=k+i;

			System.out.println("Wert von k: " + k);
		*/
		k=0;
		for (i=1; i<10; i++)
		if (i==6)
		break;
		else
		k=k+i;

		System.out.println("Wert von k: " + k);
	}

}
