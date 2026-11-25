package abstraction.shapes;

public abstract class Shape {

    abstract double calculateArea();

    public void print() {
        System.out.println("The area of the shape is: " + calculateArea());
    }

}
