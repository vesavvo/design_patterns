package prototype.wargame.advanced;

public class Main {
    public static void main(String[] args) {

        final int GROUP_SIZE = 8;

        // Create a soldier using the builder pattern
        Director director = new Director();
        SoldierBuilder builder = new SoldierBuilder();
        director.constructInfantrySoldier(builder);
        Soldier soldier = builder.getResult();

        System.out.println(soldier);

        // Create a group of soldiers by cloning the original soldier
        for (int i = 0; i < GROUP_SIZE; i++) {
            Soldier clonedSoldier = soldier.clone();
            System.out.println(clonedSoldier);
        }
    }
}
