module mx.edu.utez.ads {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static ucp;

    exports mx.edu.utez.ads;
    opens mx.edu.utez.ads.controllers.auth to javafx.fxml;
    opens mx.edu.utez.ads.utils to javafx.fxml;
    exports mx.edu.utez.ads.utils;
}