package prototype.wargame.simple;

public class Weapon implements Prototype {
    private String type;

    public Weapon(String type) {
        this.type = type;
    }

    @Override
    public Weapon clone() {
        return new Weapon(this.type);
    }

    @Override
    public String toString() {
        return "Weapon{" +
               "type='" + type + '\'' +
               '}';
    }
}
