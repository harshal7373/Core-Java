package Polymorphisms;

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding the makeSound() method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Run_Time_Polymorphism {
    public static void main(String[] args) {
    	
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Calls parent class method

        Dog myDog = new Dog();
        myDog.makeSound();  // Calls overridden method in Dog class
    }
}
