package flyweight.birch_trees;

import javafx.scene.image.Image;

public class TreeImage {
    private Image image;
    private String description;

    public TreeImage(String imagePath, String description) {
        this.image = new Image(imagePath);
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
