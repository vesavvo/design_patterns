package prototype.wargame.advanced;

public class SoldierBuilder {
    private Soldier soldier;

    public SoldierBuilder() {
        reset();
    }

    public void reset() {
        soldier = new Soldier();
    }

    public void addWeapon(String name) {
        soldier.addItem(new Weapon(name));
    }

    public void addGenericItem(String name) {
        soldier.addItem(new Item(name) {});
    }

    public Soldier getResult() {
        Soldier builtSoldier = soldier;
        reset();
        return builtSoldier;
    }
}
