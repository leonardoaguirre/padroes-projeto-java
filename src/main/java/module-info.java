module com.example.padroesprojetojava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.padroesprojetojava to javafx.fxml;
    exports com.example.padroesprojetojava;
}