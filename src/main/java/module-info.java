module mx.edu.utez.ads {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.edu.utez.ads to javafx.fxml;
    exports mx.edu.utez.ads;
}