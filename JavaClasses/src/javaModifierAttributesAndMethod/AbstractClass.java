package javaModifierAttributesAndMethod;


//Abstract class with an abstract method
abstract class Shape {
 // Abstract method (no implementation)
 public abstract double calculateArea();

 // Concrete method
 public void displayArea() {
     System.out.println("Area: " + calculateArea());
 }
}

//Concrete subclass 1
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementing the abstract method
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Concrete subclass 2
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementing the abstract method
 @Override
 public double calculateArea() {
     return length * width;
 }
}

public class AbstractClass {
 public static void main(String[] args) {
     Circle circle = new Circle(5);
     circle.displayArea();

     Rectangle rectangle = new Rectangle(4, 6);
     rectangle.displayArea();
 }
}
