package javaUserInputScanner;
import java.util.Scanner;

class InputTypes {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    //System.out.println("Enter name, age and salary:");

    // String input
    System.out.print("Enter name:");
    String name = myObj.nextLine();

    // Numerical input
    System.out.print("Enter age:");
    int age = myObj.nextInt();
    System.out.print("Enter salary:");
    double salary = myObj.nextDouble();
    
 // Numerical input
    System.out.print("Enter gender:");
    String gender = myObj.next();

    // Output input by user
    System.out.println("Name: " + name); 
    System.out.println("Age: " + age); 
    System.out.println("Salary: " + salary); 
  }
}