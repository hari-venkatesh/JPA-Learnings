module com.example.jpalearnings {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jpalearnings to javafx.fxml;
    exports com.example.jpalearnings;
}