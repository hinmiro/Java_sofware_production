package module03;

public class Shape {
    String name;
    private double area;
    public Shape(String name) {this.name = name;}

    public double calculateArea() {
        return area;
    }

    public String getVariables() {
        return "variables";
    }

    public String getName() {
        return this.name;
    }
}
