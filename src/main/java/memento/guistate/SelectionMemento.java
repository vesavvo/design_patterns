package memento.guistate;

public class SelectionMemento implements Memento {
    private int[] options;
    private boolean isSelected;

    public SelectionMemento (int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options.clone(); // Return a copy of options array
    }

    public boolean isSelected() {
        return isSelected;
    }
}
