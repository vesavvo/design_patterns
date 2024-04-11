package prototype.wargame.advanced;

import java.util.ArrayList;
import java.util.List;

public class Soldier implements Cloneable {
    private List<Item> items;

    public Soldier() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public Soldier clone() {
        try {
            Soldier clonedSoldier = (Soldier) super.clone();
            clonedSoldier.items = new ArrayList<>();
            // deep copy
            for (Item item : this.items) {
                clonedSoldier.addItem(item.clone());
            }
            return clonedSoldier;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Soldier with items: " + items;
    }
}
