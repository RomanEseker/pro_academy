module org.example.filefilter {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.filefilter to javafx.fxml;
    exports org.example.filefilter;
}