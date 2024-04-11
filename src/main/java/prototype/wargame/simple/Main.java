package prototype.wargame.simple;

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("Rifle");
        Soldier soldier = new Soldier(weapon);

        Soldier clonedSoldier = soldier.clone();

        System.out.println(soldier);
        System.out.println(clonedSoldier);
    }
}
