package teil02;

public class ArrayAnlegenDemo {

	public static void main(String[] args) {

        // Array arrayEins mit 5 Elementen anlegen
        int[] arrayEins = new int[5];

        // Elemente des Arrays mit Werten belegen
        arrayEins[0] = 7;
        arrayEins[1] = 20;
        arrayEins[2] = 877;
        arrayEins[3] = 76;
        arrayEins[4] = 1;

        // Das dritte Element des Arrays ausgeben
        System.out.println(arrayEins[2]);

        // Array arrayZwei mit 3 Elementen anlegen und initialisieren
        int[] arrayZwei = {7, 18, 5};

        // Das zweite Element des Arrays ausgeben
        System.out.println(arrayZwei[1]);
    }
}

