package module03;

import java.util.ArrayList;

public class ShapeCalculator {

    public static void main(String[] args) {
        System.out.println("Shape Calculator");
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(4.5, "circle"));
        shapes.add(new Rectangle(4.5, 6.5, "rectangle"));
        shapes.add(new Triangle(3, 6, "triangle"));
        for (Shape shape : shapes) {
            System.out.printf("Area of %s with %s: %.2f\n", shape.getName(), shape.getVariables(), shape.calculateArea());
        }
    }
}
