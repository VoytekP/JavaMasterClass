package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {

    @FXML
    private Label label;

    @FXML
    public void handleAction() {
        label.setText("OK Button pressed");
    }
}
