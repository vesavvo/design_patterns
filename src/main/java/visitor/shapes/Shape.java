package visitor.shapes;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
