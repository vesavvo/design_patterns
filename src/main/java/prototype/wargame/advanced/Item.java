package prototype.wargame.advanced;

public abstract class Item implements Cloneable {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
           throw new RuntimeException("This should not happen since we implement Cloneable", e);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
