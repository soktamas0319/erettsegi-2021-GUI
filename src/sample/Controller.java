package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private void handleButtonAction (ActionEvent event) {
        System.out.println("You clicked me!");
        //label.setText("Hello World!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
