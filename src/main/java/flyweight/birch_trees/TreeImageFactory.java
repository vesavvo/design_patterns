package flyweight.birch_trees;

import javafx.scene.image.Image;

public class TreeImageFactory {
    private static TreeImage leafyTreeImage = new TreeImage("birch_summer.png", "Leafy birch tree");
    private static TreeImage leaflessTreeImage = new TreeImage("birch_winter.png", "Leafless birch tree");

    public static TreeImage getLeafyTreeImage() {
        return leafyTreeImage;
    }

    public static TreeImage getLeaflessTreeImage() {
        return leaflessTreeImage;
    }
}
