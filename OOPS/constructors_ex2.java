class MyClass {
    private int number;
    private String text;

    // Default constructor
    public MyClass() {
        this.number = 0;
        this.text = "Default";
    }

    // Parameterized constructor
    public MyClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Copy constructor
    public MyClass(MyClass other) {
        this.number = other.number;
        this.text = other.text;
    }

    public void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();  // Default constructor
        MyClass obj2 = new MyClass(10, "Hello");  // Parameterized constructor
        MyClass obj3 = new MyClass(obj2);  // Copy constructor

        obj1.display();  // Output: Number: 0, Text: Default
        obj2.display();  // Output: Number: 10, Text: Hello
        obj3.display();  // Output: Number: 10, Text: Hello
    }
}
