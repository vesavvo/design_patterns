package memento.guistate;

public class Model {
    private int[] options = new int[3];
    private boolean isSelected;

    public void setOption(int optionNumber, int choice) {
        System.out.println("optionNumber: " + optionNumber + " choice: " + choice);
        if (optionNumber >= 1 && optionNumber <= 3) {
            options[optionNumber - 1] = choice;
        }
    }

    public int getOption(int optionNumber) {
        if (optionNumber >= 1 && optionNumber <= 3) {
            return options[optionNumber - 1];
        }
        return -1;
    }

    public void setIsSelected(boolean isSelected) {
        System.out.println("isSelected: " + isSelected);
        this.isSelected = isSelected;
    }

    public boolean getIsSelected() {
        return isSelected;
    }

    // Metodi tilan tallentamiseksi mementoksi
    public Memento createMemento() {
        return new Memento(options, isSelected);
    }

    // Metodi tilan palauttamiseksi mementosta
    public void restoreState(Memento memento) {
        options = memento.getOptions();
        System.out.println("options: " + options[0] + " " + options[1] + " " + options[2]);
        isSelected = memento.isSelected();
        System.out.println("isSelected: " + isSelected);
        System.out.println("State restored");
    }
}