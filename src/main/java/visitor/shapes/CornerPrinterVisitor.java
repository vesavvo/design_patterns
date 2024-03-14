package visitor.shapes;

public class CornerPrinterVisitor implements ShapeVisitor {

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Rectangle corners: (" + rectangle.x + "," + rectangle.y + "), " +
                "(" + (rectangle.x + rectangle.width) + "," + rectangle.y + "), " +
                "(" + (rectangle.x + rectangle.width) + "," + (rectangle.y + rectangle.height) + "), " +
                "(" + rectangle.x + "," + (rectangle.y + rectangle.height) + ")");
    }

    @Override
    public void visit(Line line) {
        System.out.println("Line points: (" + line.startX + "," + line.startY + ") to (" + line.endX + "," + line.endY + ")");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Triangle corners: (" + triangle.x1 + "," + triangle.y1 + "), " +
                "(" + triangle.x2 + "," + triangle.y2 + "), " +
                "(" + triangle.x3 + "," + triangle.y3 + ")");
    }
}
