package prototype.wargame.advanced;

public class WearableItem extends Item implements Cloneable {
    public WearableItem(String name) {
        super(name);
    }

    @Override
    public WearableItem clone() {
            return (WearableItem) super.clone();
    }
}
