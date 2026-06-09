abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void area() {
        System.out.println("Area = " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.area();
    }
}
