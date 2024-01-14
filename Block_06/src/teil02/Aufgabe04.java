package teil02;

public class Aufgabe04 {

    public static void main(String[] args) {
        // Schritt 1: Array "prime" mit einem Array-Literal erstellen
        int[] prime = {2, 3, 5, 7, 11, 13};

        // Schritt 2: Alle Werte des Arrays "prime" mit einer foreach-Schleife ausgeben
        System.out.println("Werte des Arrays 'prime':");
        for (int value : prime) {
            System.out.print(value +" ");
           
        }

        // Schritt 3: Array "squares" mit 10 Werten vom Typ double erstellen
       System.out.println("\n");
        double[] squares = new double[10];
        System.out.println("\nDas Quadrat von \"i\" ist +squares[i])");
        
        
        
        // Schritt 4: Quadrat des jeweiligen Indexwertes in das Array "squares" speichern
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i; // Math.pow(i, 2);
          // double i1=i;
            System.out.println("Das Quadrat von "+ i+" ist " +squares[i]);
        }

        // Eigenes Array "squares1" erstellen
        System.out.println("\n");
        double[] squares1 = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};

        // Array "squaresM" erstellen und Werte berechnen
        double[] squaresM = new double[10];
      
        // Schritt 4: Quadrat des jeweiligen Indexwertes in das Array "squaresM" speichern
        for (int i = 0; i < squares.length; i++) {
            squaresM[i] = i*i ;//squares1[k] * squares1[k]; // Math.pow(i, 2);
            System.out.println("Das Quadrat von "+ squares1[i]+" ist " +squaresM[i]);
        }
     
        
        // Schritt 5: Array "squares" in ein neues Array "squaresCopy" kopieren
        double[] squaresCopy= new double[squares.length];
        
        System.out.println("\nsquaresCopy[i]: ");
        for (int i = 0; i < squares.length; i++) {
        squaresCopy[i] = squares[i]; //squares.clone()
        System.out.print(squaresCopy[i]+" ");
        }
        
        // Schritt 6: Alle Werte des Arrays "squaresCopy" auf den Wert 0.5 ändern
        for (int i = 0; i < squaresCopy.length; i++) {
            squaresCopy[i] = 0.5;
        }
        System.out.println("\n");
        // Schritt 7: Werte beider Arrays ausgeben
        System.out.println("\nWerte des Arrays 'squares' und 'squaresCopy':");
        for (int val = 0; val < squares.length; val++) {
            System.out.println("squares: " + squares[val] + ", squaresCopy: " + squaresCopy[val]);
        }
    }
}
