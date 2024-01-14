package teil03;

import java.util.Scanner;

public class Aufgabe03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Schüler ein: ");
        int schuelerAnzahl = scanner.nextInt();

        // Array für die Noten der Schüler erstellen
        double[] noten = new double[schuelerAnzahl];

        // Noten von der Tastatur einlesen und im Array speichern
        for (int i = 0; i < noten.length; i++) {
            System.out.print("Geben Sie die Note für Schüler " + (i + 1) + " ein: ");
            noten[i] = scanner.nextDouble();
        }

        // Durchschnittsnote berechnen
        double summe = 0;
        for (double note : noten) {
            summe += note;
        }
        double durchschnitt = summe / schuelerAnzahl;

        System.out.println("Durchschnittsnote der Klasse: " + durchschnitt);

        // Schüler mit überdurchschnittlichen Noten anzeigen
        System.out.println("Schüler mit überdurchschnittlichen Noten:");
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] > durchschnitt) {
                System.out.println("Schüler " + (i + 1) + ": " + noten[i]);
            }
        }

        scanner.close();
    }
}
