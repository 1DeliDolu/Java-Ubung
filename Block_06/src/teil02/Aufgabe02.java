package teil02;

public class Aufgabe02 {
	
	    public static void main(String[] args) {
	        int[] arrayEins = new int[5];

	        // Methode aufrufen, um das Array einzulesen
	        liesArray(arrayEins);

	        // Alle Werte ausgeben
	        ausgabeArray(arrayEins);

	        // Das dritte Element mit dem zweiten Element multiplizieren
	        int ergebnisMultiplikation = multipliziereArray(arrayEins, 2, 1);
	        System.out.println("Ergebnis der Multiplikation: " + ergebnisMultiplikation);

	        // Das erste Element durch das vierte Element dividieren
	        double ergebnisDivision = dividiereArray(arrayEins, 0, 3);
	        System.out.println("Ergebnis der Division: " + ergebnisDivision);

	        // Überprüfen, ob das fünfte Element ein Teiler des dritten Elements ist
	        if (istTeiler(arrayEins, 4, 2)) {
	            System.out.println("5. Element ist Teiler vom 3. Element");
	        } else {
	            System.out.println("5. Element ist kein Teiler vom 3. Element");
	        }

	        // Das erste Element durch die Zahl 127 ersetzen
	        ersetzeElement(arrayEins, 0, 127);

	        // Methode aufrufen, um das Array erneut zu dividieren
	        ergebnisDivision = dividiereArray(arrayEins, 0, 3);
	        System.out.println("Ergebnis der Division nach ersetzeElement: " + ergebnisDivision);
	    }

	    // Methode zum Einlesen von Werten in ein Array
	    private static void liesArray(int[] array) {
	        array[0] = 2;
	        array[1] = 18;
	        array[2] = 22;
	        array[3] = 21;
	        array[4] = 7;
	    }

	    // Methode zum Ausgeben der Werte in einem Array
	    private static void ausgabeArray(int[] array) {
	        System.out.println("Werte im Array:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Element " + i + ": " + array[i]);
	        }
	    }

	    // Methode zum Multiplizieren von zwei Elementen in einem Array
	    private static int multipliziereArray(int[] array, int index1, int index2) {
	        return array[index1] * array[index2];
	    }

	    // Methode zum Dividieren von zwei Elementen in einem Array
	    private static double dividiereArray(int[] array, int index1, int index2) {
	        // Überprüfen, ob der Divisor nicht null ist, um eine Division durch Null zu vermeiden
	        if (array[index2] != 0) {
	            return (double) array[index1] / array[index2];
	        } else {
	            // Rückgabewert 0.0 bei Division durch Null
	            return 0.0;
	        }
	    }

	    // Methode zum Überprüfen, ob ein Element ein Teiler eines anderen Elements ist
	    private static boolean istTeiler(int[] array, int index1, int index2) {
	        return array[index1] % array[index2] == 0;
	    }

	    // Methode zum Ersetzen eines Elements in einem Array
	    private static void ersetzeElement(int[] array, int index, int neuerWert) {
	        array[index] = neuerWert;
	        // Methode dividiereArray mit neuem Wert aufrufen
	        double ergebnisDivision = dividiereArray(array, 0, 3);
	        System.out.println("Ergebnis der Division in ersetzeElement: " + ergebnisDivision);
	    }
	}
