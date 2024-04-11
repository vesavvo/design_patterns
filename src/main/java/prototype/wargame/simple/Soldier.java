package prototype.wargame.simple;

public class Soldier implements Prototype {
    private Weapon weapon;

    public Soldier(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public Soldier clone() {
        // Tämä on matalakopio, koska ase-olio ei kloonata syvällisesti.
        return new Soldier(this.weapon);
    }

    @Override
    public String toString() {
        return "Soldier{" +
               "weapon=" + weapon +
               '}';
    }
}
