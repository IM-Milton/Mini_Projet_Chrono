module com.example.mini_projet_chrono {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.mini_projet_chrono to javafx.fxml;
    exports com.example.mini_projet_chrono;
}