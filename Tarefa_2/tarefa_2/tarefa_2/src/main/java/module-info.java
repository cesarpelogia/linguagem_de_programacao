module com.tarefa_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens com.tarefa_2 to javafx.fxml;

    exports com.tarefa_2;
}
