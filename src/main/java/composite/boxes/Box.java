package composite.boxes;

import java.util.*;

public class Box extends Component {

    private List<Component> children = new ArrayList<>();

    public Box(String name) {
        super(name);
    }

    @Override
    public void printData() {
        System.out.println("Box: " + this.name);

        // print the contents of all children
        System.out.println("BEGIN: contents of " + this.name);
        for (Component child : this.children) {
            child.printData();
        }
        System.out.println("END: contents of " + this.name);
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
