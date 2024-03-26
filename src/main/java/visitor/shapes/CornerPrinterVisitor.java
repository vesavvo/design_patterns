package visitor.shapes;

public class CornerPrinterVisitor implements ShapeVisitor {

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Rectangle corners: (" + rectangle.getX() + "," + rectangle.getY() + "), " +
                "(" + (rectangle.getX() + rectangle.getWidth()) + "," + rectangle.getY() + "), " +
                "(" + (rectangle.getX() + rectangle.getWidth()) + "," + (rectangle.getY() + rectangle.getHeight()) + "), " +
                "(" + rectangle.getX() + "," + (rectangle.getY() + rectangle.getHeight()) + ")");
    }

    @Override
    public void visit(Line line) {
        System.out.println("Line endpoints: (" + line.getStartX() + "," + line.getStartY() + "), (" + line.getEndX() + "," + line.getEndY() + ")");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Triangle corners: (" + triangle.getX1() + "," + triangle.getY1() + "), " +
                "(" + triangle.getX2() + "," + triangle.getY2() + "), " +
                "(" + triangle.getX3() + "," + triangle.getY3() + ")");
    }
}
