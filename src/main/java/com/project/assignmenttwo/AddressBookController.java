package com.project.assignmenttwo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AddressBookController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}