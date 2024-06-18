// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Subclass 3
class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Lion();

        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphic method call
        }
    }
}
