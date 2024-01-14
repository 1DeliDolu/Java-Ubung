package javaModifierAttributesAndMethod;

class Parent {
    // Using final for a method
   final public void displayMessage() {
        System.out.println("This is a final method in the Parent class.");
    }
}

class Child extends Parent {
    // This will result in a compilation error
    // since we are trying to override a final method
    @Override
    public void displayMessage() {
        System.out.println("Trying to override a final method in the Child class.");
    }
}

public class FinalClass {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.displayMessage();

        Child child = new Child(); // This line will cause a compilation error
        child.displayMessage();
    }
}