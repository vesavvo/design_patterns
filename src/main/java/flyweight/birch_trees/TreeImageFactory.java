package flyweight.birch_trees;

import java.util.EnumMap;
import java.util.Map;

public class TreeImageFactory {

    private static final Map<TreeType, TreeImage> images = new EnumMap<>(TreeType.class);

    public static TreeImage getTreeImage(TreeType type) {
        TreeImage image = images.get(type);
        if (image == null) {
            switch (type) {
                case SUMMER:
                    image = new TreeImage("birch_summer.png", "Leafy birch tree");
                    break;
                case WINTER:
                    image = new TreeImage("birch_winter.png", "Leafless birch tree");
                    break;
            }
            images.put(type, image);
        }
        return image;
    }
}
