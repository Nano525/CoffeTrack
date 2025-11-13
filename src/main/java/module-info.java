module mx.edu.utez.ads {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static ucp;
    requires java.desktop;

    exports mx.edu.utez.ads;
    opens mx.edu.utez.ads.controllers.auth to javafx.fxml;
    opens mx.edu.utez.ads.controllers.user to javafx.fxml;
    opens mx.edu.utez.ads.controllers.admin to javafx.fxml;
    opens mx.edu.utez.ads.controllers.shared to javafx.fxml;
    opens mx.edu.utez.ads.utils to javafx.fxml;
    exports mx.edu.utez.ads.utils;
}