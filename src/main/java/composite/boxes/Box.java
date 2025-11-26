package composite.boxes;

import java.util.*;

public class Box extends Component {

    private List<Component> children = new ArrayList<>();

    public Box(String name) {
        super(name);
    }

    @Override
    public void printData() {
        super.printData();
        for (Component child : this.children) {
            child.printData();
        }
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return this.children.get(index);
    }
}
