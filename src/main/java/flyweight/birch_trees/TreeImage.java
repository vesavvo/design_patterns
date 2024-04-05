package flyweight.birch_trees;

import javafx.scene.image.Image;

public class TreeImage implements Flyweight {
    private final Image image;
    private final String description;

    public TreeImage(String imagePath, String description) {
        this.image = new Image(imagePath);
        this.description = description;
    }

    @Override
    public Image getImage() {
        return image;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
