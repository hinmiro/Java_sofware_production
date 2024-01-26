package module03;

public class Shape {
    String name, color;
    private double area;
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public double calculateArea() {
        return area;
    }

    public String getVariables() {
        return "variables";
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }
}
