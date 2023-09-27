module com.example.prueba1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prueba1 to javafx.fxml;
    exports com.example.prueba1;
    exports com.example.prueba1.aplication;
    opens com.example.prueba1.aplication to javafx.fxml;
    exports com.example.prueba1.controllers;
    opens com.example.prueba1.controllers to javafx.fxml;
}