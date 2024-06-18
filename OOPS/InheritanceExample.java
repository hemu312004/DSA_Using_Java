// Superclass
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to print details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Call to superclass constructor
        this.breed = breed;
    }

    // Method to print details including breed
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to superclass method
        System.out.println("Breed: " + breed);
    }

    // Method specific to Dog class
    public void bark() {
        System.out.println("Bark!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog dog = new Dog("Buddy", 3, "Labrador");
        
        // Calling methods from superclass
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        
        // Calling methods from subclass
        dog.bark();
        dog.displayInfo();
    }
}
