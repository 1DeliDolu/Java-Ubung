package javaPolymorphism;

class Animal1 {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig1 extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog1 extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Animal myAnimal = new Animal();
	    Animal myPig = new Pig1();
	    Animal myDog = new Dog1();
	        
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	  }
	}