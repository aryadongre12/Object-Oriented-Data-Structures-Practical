abstract class Shape {
    int s1;
    int s2;

    Shape(int s1, int s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    public abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int l, int w) {
        super(l,w);
    }
    public void printArea() {
        int area = s1 * s2;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int b, int h) {
        super(b,h);
    }
    public void printArea() {
        double area = 0.5 * s1 * s2;
        System.out.println("Triangle Area: " + area);
    }
}

class Circle extends Shape {
    Circle(int rad) {
        super(rad, 0);
    }
    public void printArea() {
        double area = 3.14 * s1 * s1;
        System.out.println("Circle Area: " + area);
    }
}

public class lab6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        r.printArea();

        Triangle t = new Triangle(4,5);
        t.printArea();

        Circle c = new Circle(2);
        c.printArea();
    }
}


