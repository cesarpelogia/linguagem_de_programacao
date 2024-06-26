package com.e2.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Button cadastrar;

    @FXML
    private Button estoque;

    @FXML
    private void initialize() {
        cadastrar.setOnAction(event -> cadastrar());
    }

    @FXML
    private void cadastrar() {
        try {
            Parent novaPagina = FXMLLoader.load(getClass().getResource("/com/e2/View/CadastroGuitarra.fxml"));
            Scene cena = new Scene(novaPagina);
            Stage novoStage = new Stage();
            novoStage.setScene(cena);
            novoStage.setTitle("Pagina de Cadastro de Guitarras");
            novoStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void estoque() {
        try {
            Parent novaPagina = FXMLLoader.load(getClass().getResource("/com/e2/View/Produtos.fxml"));
            Scene cena = new Scene(novaPagina);
            Stage novoStage = new Stage();
            novoStage.setScene(cena);
            novoStage.setTitle("Pagina de Produtos");
            novoStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
