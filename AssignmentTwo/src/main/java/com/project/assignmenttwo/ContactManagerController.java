package com.project.assignmenttwo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.ArrayList;

public class ContactManagerController {
    Contact contact = new Contact(); //test contact
    ListView<String> contactList = new ListView<String>();

    @FXML
    private void onAddClick(){
        System.out.println("Button should add person to list view");
    }
    @FXML
    private void onEditClick(){
        System.out.println("Button should edit selected ");
    }
    @FXML
    private void onRmvClick(){
        System.out.println("Button should remove user from the list ");
    }

    //TO DO: Search bar
}