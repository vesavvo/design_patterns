package prototype.wargame.advanced;

public class Weapon extends Item implements Cloneable {
    private static int idCounter = 0;
    private int id;

    public Weapon(String name) {
        super(name);
        this.id = ++idCounter;
    }

    @Override
    public Weapon clone() {
        Weapon cloned = (Weapon) super.clone();
        cloned.id = ++idCounter;  // Generoidaan uusi uniikki ID kloonille
        return cloned;
    }

    @Override
    public String toString() {
        return super.toString() + " with ID " + id;
    }
}
