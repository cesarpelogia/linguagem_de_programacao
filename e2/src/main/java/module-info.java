module com.e2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.e2.Controller;
    exports com.e2;
}
