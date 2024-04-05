package flyweight.birch_trees;

class Tree {
    private boolean isLeafy;
    private TreeImage treeImage;

    public Tree(TreeImage treeImage) {
        // This constructor is important! Note that there is no creation of Image object here.
        this.treeImage = treeImage;
        this.isLeafy = false;
    }

    public boolean isLeafy() {
        return isLeafy;
    }

    public void makeLeafy(TreeImage leafyImage) {
        isLeafy = true;
        this.treeImage = leafyImage;
    }

    public TreeImage getTreeImage() {
        return treeImage;
    }
}
