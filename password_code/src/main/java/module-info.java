module com.example.password_code {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.password_code to javafx.fxml;
    exports com.example.password_code;
}