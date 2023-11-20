module com.example {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.military_taskten to javafx.fxml;
    exports com.example.military_taskten;
}