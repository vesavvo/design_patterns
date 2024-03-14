package visitor.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create a list of shapes
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 10, 20, 30));
        shapes.add(new Line(0, 0, 15, 15));
        shapes.add(new Triangle(0, 0, 4, 0, 2, 3));

        // create a visitor
        AreaCalculatorVisitor areaCalculator = new AreaCalculatorVisitor();

        // calculate the area of each shape in the list
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        CornerPrinterVisitor cornerPrinter = new CornerPrinterVisitor();
        for (Shape shape : shapes) {
            shape.accept(cornerPrinter);
        }
    }
}
