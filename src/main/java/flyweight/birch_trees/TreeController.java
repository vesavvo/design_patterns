package flyweight.birch_trees;

import javafx.scene.image.Image;

class TreeController {
    private static final int GRID_WIDTH = 5;
    private static final int GRID_HEIGHT = 5;
    private Tree[][] trees;
    private int leafyTreeCount = 0;
    private TreeImage leaflessImage = new TreeImage("birch_winter.png", "Leafless birch tree");
    private TreeImage leafyImage = new TreeImage("birch_summer.png", "Leafy birch tree");

    public TreeController() {
        trees = new Tree[GRID_HEIGHT][GRID_WIDTH];
        for (int i = 0; i < GRID_HEIGHT; i++) {
            for (int j = 0; j < GRID_WIDTH; j++) {
                trees[i][j] = new Tree(TreeImageFactory.getLeaflessTreeImage());
            }
        }
    }

    public void makeTreeLeafy(int row, int col) {
        if (!trees[row][col].isLeafy()) {
            trees[row][col].makeLeafy(TreeImageFactory.getLeafyTreeImage());
            leafyTreeCount++;
        }
    }

    public Image getTreeImage(int row, int col) {
        Tree tree = trees[row][col];
        return tree.getTreeImage().getImage();
    }

    public boolean isTreeLeafy(int row, int col) {
        return trees[row][col].isLeafy();
    }

    public int getLeafyTreeCount() {
        return leafyTreeCount;
    }

    public int getGridWidth() {
        return GRID_WIDTH;
    }

    public int getGridHeight() {
        return GRID_HEIGHT;
    }

    public Tree getTree(int row, int col) {
        return trees[row][col];
    }
}
