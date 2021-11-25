package com.project.assignmenttwo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ContactManager extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //----------------------------Root(grid)--------------------------------------
        GridPane grid = new GridPane();
        //---------------------------Padding and Margin------------------------------
        grid.setHgap(10);
        grid.setVgap(10);
        Insets padding = new Insets(25, 25, 25, 25);
        grid.setPadding(padding);
        //----------------------------Add text, label, text fields, btn--------------
        Text sceneTitle = new Text("Contact Manager");
        Font value = Font.font("Tahoma", FontWeight.MEDIUM, 20);
        sceneTitle.setFont(value);
        grid.add(sceneTitle, 0, 0, 2, 1);

        //---------------------------Labels--------------------------------------------
        Label fName = new Label("First Name: ");
        grid.add(fName, 0, 1);
        Label lName = new Label("Last name: ");
        grid.add(lName, 0, 2);
        Label homePhone = new Label("Home Phone:");
        grid.add(homePhone, 0, 3);
        Label workPhone = new Label("Work Phone: ");
        grid.add(workPhone, 0, 4);
        Label homeAdd = new Label("Home Address: ");
        grid.add(homeAdd, 0, 5);
        Label email = new Label("E-Mail: ");
        grid.add(email, 0, 6);
        Label birthday = new Label("Birthday: ");   //Will need some verification so it fits into our MyDate class
        grid.add(birthday, 0, 7);
        Label notes = new Label("Notes: ");     //Should be text area
        grid.add(notes, 0, 8);
        //-------------------------- Text Field----------------------------------------
        TextField inputFName = new TextField();
        //inputFName.setMinWidth(200);
        grid.add(inputFName, 1, 1);

        TextField inputLName = new TextField();
        grid.add(inputLName, 1,2);
        TextField inputHPhone = new TextField();
        grid.add(inputHPhone, 1,3);
        TextField inputWPhone = new TextField();
        grid.add(inputWPhone, 1,4);

        TextField inputAddress = new TextField();
        grid.add(inputAddress, 1, 5);
        TextField inputEmail = new TextField();
        grid.add(inputEmail, 1,6);
        TextField inputBDay = new TextField();
        grid.add(inputBDay, 1, 7);
        TextField inputNotes = new TextField();
        grid.add(inputNotes, 1,8);

        Text outputText = new Text();
        grid.add(outputText, 1, 9);


        //------------------------- Button --------------------------------------------
        Button addPerson = new Button("Add");
        addPerson.setAlignment(Pos.CENTER);
        grid.add(addPerson, 1, 10);
        Button edit = new Button("Edit");
        edit.setAlignment(Pos.CENTER_RIGHT);
        grid.add(edit, 6, 10);
        Button delete = new Button("Delete");
        delete.setAlignment(Pos.CENTER_RIGHT);
        grid.add(delete, 7, 10);
        //START
        Scene scene = new Scene(grid, 500, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}