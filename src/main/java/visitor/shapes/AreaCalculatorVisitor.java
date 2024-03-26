package visitor.shapes;

public class AreaCalculatorVisitor implements ShapeVisitor {

    @Override
    public void visit(Rectangle rectangle) {
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle area: " + area);
    }

    @Override
    public void visit(Line line) {
        System.out.println("Line does not have an area.");
    }

    @Override
    public void visit(Triangle triangle) {
        // see e.g. https://wikieducator.org/Math_Tables_and_Formulas/Analytic_Geometry/Area_of_a_triangle_given_its_vertices
        double area = Math.abs(0.5 * (triangle.getX1() * (triangle.getY2() - triangle.getY3()) + triangle.getX2() * (triangle.getY3() - triangle.getY1()) + triangle.getX3() * (triangle.getY1() - triangle.getY2())));
        System.out.println("Triangle area: " + area);
    }
}
