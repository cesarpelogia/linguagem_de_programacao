module com.e2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires transitive javafx.graphics;

    opens com.e2.Controller;
    exports com.e2;
}
