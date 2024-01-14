package teil02;

public class ArrayAnlegenDemo1 {

    public static void main(String[] args) {
        // 2. Lege innerhalb der main-Methode ein Integer-Array (arrayEins) mit einer Länge von 5 an.
        int[] arrayEins = new int[5];

        // 3. In diesem Array sollen dann 5 Zahlen gespeichert werden (4. bis 5.).
        arrayEins[0] = 7;
        arrayEins[1] = 20;
        arrayEins[2] = 877;
        arrayEins[3] = 76;
        arrayEins[4] = 1;

        // 5. Lass dir dann das dritte Element des Arrays auf der Konsole ausgeben.
        System.out.println("Das dritte Element des ersten Arrays: " + arrayEins[2]);

        // 6. Lege dann in der Klasse ein Array, namens arrayZwei an, welches Integer-Werte speichert.
        //    Anders als in der letzten Übung soll jetzt das Array in einem Zug deklariert und initialisiert werden.
        //    Und zwar belegst du die Fächer mit den Werten 7, 18 und 5.
        int[] arrayZwei = {7, 18, 5};

        // 7. Lass dir aus Kontrollzwecken den Inhalt des zweiten Faches auf der Konsole ausgeben.
        System.out.println("Der Inhalt des zweiten Arrays: " + arrayZwei[1]);
    }
}