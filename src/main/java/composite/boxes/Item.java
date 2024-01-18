package composite.boxes;

public class Item extends Component {

    public Item(String name) {
        super(name);
    }

    @Override
    public void printData() {
        System.out.println("Item: " + this.name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }
}
