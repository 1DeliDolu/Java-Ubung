package javaModifierAttributesAndMethod;
public class StaticClass {
    // Static variable belongs to the class, not instances
    public static int staticVariable = 0;

    // Instance variable, each object has its own copy
    public int instanceVariable;

    // Static method belongs to the class, not tied to any instance
    public static void staticMethod() {
        System.out.println("This is a static method.");
        // You can access static variables directly in a static method
        System.out.println("Static variable: " + staticVariable);
        // Cannot access instanceVariable directly in a static method, as it's tied to instances
        // System.out.println("Instance variable: " + instanceVariable); // This would cause a compilation error
    }

    // Instance method, operates on an instance of the class
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        // You can access both static and instance variables in an instance method
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        // You can call a static method directly on the class
    	StaticClass.staticMethod();

        // To access instance members, you need to create an object
    	StaticClass obj = new StaticClass();
        obj.instanceMethod();
    }
}
