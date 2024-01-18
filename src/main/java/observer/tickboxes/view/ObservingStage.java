package observer.tickboxes.view;

import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import observer.tickboxes.model.Observable;
import observer.tickboxes.model.UserSelection;

public class ObservingStage extends Stage implements Observer {

    private UserSelection observable;

    public ObservingStage(UserSelection observable) {

        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Stage received an update.");


        Node node = this.getScene().getRoot().lookup("#checkbox");
        if (node instanceof CheckBox) {
            ((CheckBox) node).setSelected(observable.isSelected());
        }

    }
}
