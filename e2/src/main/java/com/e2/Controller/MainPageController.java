package com.e2.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Button entrar;

    @FXML
    private void initialize() {
        entrar.setOnAction(event -> entrar());
    }

    @FXML
    private void entrar() {
        try {
            Parent novaPagina = FXMLLoader.load(getClass().getResource("/com/e2/View/CadastroGuitarra.fxml"));
            Scene cena = new Scene(novaPagina);
            Stage novoStage = new Stage();
            novoStage.setScene(cena);
            novoStage.setTitle("Nova Página");
            novoStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
