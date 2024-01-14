package javaPolymorphism;

public class Animal {
	public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	 
	  public static void main(String[] args) {
		    Animal myAnimal = new Animal();
		    Animal myPig = new Pig1();
		    Animal myDog = new Dog1();
		        
		    myAnimal.animalSound();
		    myPig.animalSound();
		    myDog.animalSound();
		  }
	}