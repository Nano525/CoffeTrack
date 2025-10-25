module mx.edu.utez.ads {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static ucp;

    opens mx.edu.utez.ads.utils to javafx.fxml;
    exports mx.edu.utez.ads.utils;
}