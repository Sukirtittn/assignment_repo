
interface Color {
    void getColorForShape();
}

class RedColor implements Color {
    public void getColorForShape() {
        System.out.print("Red");

    }

}

class BlueColor implements Color {
    public void getColorForShape() {
        System.out.print("Blue");

    }

}

class PinkColor implements Color {
    public void getColorForShape() {
        System.out.print("Pink");
    }

}

abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void getColor();
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    void getColor() {
        color.getColorForShape();
        System.out.println("Square\n");

    }
}

class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }
    void getColor() {
        color.getColorForShape();
        System.out.print("Triangle \n");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(new RedColor());
        shape1.getColor();

        Shape shape2 = new Square(new BlueColor());
        shape2.getColor();
    }
}