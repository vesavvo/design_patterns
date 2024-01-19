package observer.checkboxes.view;

import javafx.scene.control.CheckBox;
import observer.checkboxes.model.UserData;

public class ObservingCheckBox extends CheckBox implements Observer {

    private UserData observable;

    public ObservingCheckBox(String text, UserData observable) {
        super(text);
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("CheckBox received an update.");
        this.setSelected(observable.isSelected());
    }
}
