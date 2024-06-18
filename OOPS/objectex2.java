

class Pen {
    String color;
   
    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}
 
public class objectex2 { // class name should start with uppercase
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.color = "blue"; // color should be a string literal

        Pen p2 = new Pen();
        p2.color = "black"; // color should be a string literal

        Pen p3 = new Pen();
        p3.color = "red"; // color should be a string literal

        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}
