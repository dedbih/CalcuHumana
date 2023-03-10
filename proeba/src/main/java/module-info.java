module com.example.proeba {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proeba to javafx.fxml;
    exports com.example.proeba;
}