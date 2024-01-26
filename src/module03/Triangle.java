package module03;

public class Triangle extends Shape {
    double a, b;


    public Triangle(double a, double b, String name, String color) {
        super(name, color);
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateArea() {
        return (this.a*this.b)/2;
    }
    @Override
    public String getVariables() {
        return String.format("base %.2f and height %.2f: ", this.a, this.b);
    }
}
