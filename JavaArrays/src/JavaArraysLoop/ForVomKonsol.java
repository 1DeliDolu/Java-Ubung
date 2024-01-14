package JavaArraysLoop;

import java.util.Arrays;
import java.util.Scanner;

public class ForVomKonsol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Erstellen Sie ein Array mit 10 int-Werten
        System.out.print("Arraylänge: ");
        int arrayLegth = scanner.nextInt();
        String[] name = new String[arrayLegth];
        int[] zahlen = new int[arrayLegth];

        // Scanner erstellen


        // Schleife über das Array und lesen Sie die Daten von der Konsole ein
        for (int i = 0; i < arrayLegth; i++) {

            System.out.print("Zahl " + i + ": ");
            zahlen[i] = scanner.nextInt();
        }

        // Schleife über das Array und lesen Sie die Daten von der Konsole ein
        for (int i = 1; i <= arrayLegth; i++) {

            System.out.print("Name " + i + ": ");
            name[i] = scanner.nextLine();
        }

        // Die eingelesenen Daten ausgeben
        System.out.println("-----------------");

        for (int i = 0; i < arrayLegth; i++) {
            System.out.println(name[i] + " " + zahlen[i]);
        }
    }
}
