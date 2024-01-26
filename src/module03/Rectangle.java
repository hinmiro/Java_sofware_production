package module03;

public class Rectangle extends Shape {
    double a, b;

    public Rectangle(double a, double b, String name, String color) {
        super(name, color);
        this.a = a;
        this.b = b;
    }
    @Override
    public String getVariables() {
        return String.format("width %.2f and height %.2f: ", this.a, this.b);
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
