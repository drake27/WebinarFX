package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {



    @FXML
    private TextField nameField;

    @FXML
    private TextField surnameField;

    @FXML
    private Label namesurLabel;

    @FXML
    private void handleButtonAction(ActionEvent event){
        System.out.println("Kliknięto przycisk");

        String name = nameField.getText();
        String surname= surnameField.getText();

        namesurLabel.setText(name +" "+ surname);


    }

}
