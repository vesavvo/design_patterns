package observer.tickboxes.model;

public class UserSelection extends Observable {

    private boolean isSelected;

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
        notifyObservers();
    }

    public boolean isSelected() {
        return isSelected;
    }
}
