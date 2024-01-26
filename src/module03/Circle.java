package module03;

public class Circle extends Shape{
    double radius;
    public Circle(double radius, String name, String color) {
        super(name, color);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return (Math.PI*(Math.pow(radius, 2)));
    }
    @Override
    public String getVariables() {
        return String.format("radius %.2f", this.radius);
    }
}
