package composite.boxes;

public class Main {

    public static void main(String[] args) {

        Component box1 = new Box("Large mailing box 1");
        Component box2 = new Box("Medium component box 2");
        Component box3 = new Box("Small component box 3");
        Component box4 = new Box("Small component box 4");
        Component box5 = new Box("Small component box 5");

        Component item1 = new Item("100 ohm resistor pack");
        Component item2 = new Item("LED pack");
        Component item3 = new Item("300 microfarad capacitor pack");
        Component item4 = new Item("510 microfarad capacitor pack");

        // put Item 1 in box 3
        box3.add(item1);

        // put Item 2 in box 4
        box4.add(item2);

        // put Item 3 in box 5
        box5.add(item3);
        box5.add(item4);

        // make boxes 2 and 3 children of box 1
        box1.add(box2);
        box1.add(box3);

        // make boxes 4 and 5 children of box 2
        box2.add(box4);
        box2.add(box5);

        // print the contents of box 1
        box1.printData();
    }
}
