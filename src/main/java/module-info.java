module com.example.factoringcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.factoringcalculator to javafx.fxml;
    exports com.example.factoringcalculator;
}