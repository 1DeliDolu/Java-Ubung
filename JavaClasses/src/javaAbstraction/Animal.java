package javaAbstraction;


//Abstract class
abstract class Animal {
// Abstract method (does not have a body)
public abstract void animalSound();
// Regular method
public void sleep() {
 System.out.println("Zzz");
}
}

//Subclass (inherit from Animal)
class Pig extends Animal {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The pig says: wee wee");
}
}

class Main {
public static void main(String[] args) {
/*From the example above, it is not possible to  create an object of the Animal class:*/	
Pig myPig = new Pig(); // Create a Pig object
myPig.animalSound();
 myPig.sleep();
}
}
