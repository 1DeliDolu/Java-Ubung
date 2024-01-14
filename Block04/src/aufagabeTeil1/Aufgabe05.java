package aufagabeTeil1;

public class Aufgabe05 {
	public static void funktionA() {
        int a = 10;
        System.out.println("In Funktion A: " + a);
    }

    public static void funktionB() {
        // Hier kann nicht direkt auf die Variable 'a' zugegriffen werden,
        // da 'a' in der FunktionA deklariert wurde und nur in FunktionA sichtbar ist.
        // Dies würde zu einem Compilerfehler führen.
        // System.out.println("In Funktion B: " + a); // Fehler!
    }

    public static void main(String[] args) {
        funktionA(); // Aufruf von FunktionA
        funktionB(); // Aufruf von FunktionB
	}

}
