module com.project.assignmenttwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.assignmenttwo to javafx.fxml;
    exports com.project.assignmenttwo;
}