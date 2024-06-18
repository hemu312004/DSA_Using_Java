

// Class for demonstrating constructors
class Constructors {
    String name;
    int age;

    // Default constructor
    public Constructors() {
        // Initialize variables if needed
        this.name = "Default";
        this.age = 0;
        System.out.println("Default Constructor called");
    }
}

// Class representing a Student
class Student {
    String name;
    int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Creating objects using constructors
        Constructors obj = new Constructors();
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Jane", 21);

        // Accessing and printing details
        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age);
        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age);
    }
}
