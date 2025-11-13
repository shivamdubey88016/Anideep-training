// Superclass --- all subclasses inherit from this class
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class Animal2 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
// or we can also call my using seperate subclasses references
        myAnimal.makeSound(); 
        myDog.makeSound();   
        myCat.makeSound();   
    }
}
