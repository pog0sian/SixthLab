module org.example.sixthlab {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.sixthlab to javafx.fxml;
    exports org.example.sixthlab;
}