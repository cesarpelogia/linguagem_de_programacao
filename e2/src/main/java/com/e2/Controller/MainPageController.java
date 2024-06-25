package com.e2.Controller;

import com.e2.Model.Guitarra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainPageController {

    @FXML

    private TextField guitarraMarcaTextField;

    @FXML
    private TextField guitarraModeloTextField;

    @FXML
    private TextField guitarraCorTextField;

    @FXML
    private TextField guitarraCordasTextField;

    @FXML
    private Button salvarButton;



    @FXML
    public void salvarGuitarra(ActionEvent event) {
        String marcaG = guitarraMarcaTextField.getText();
        String modeloG = guitarraModeloTextField.getText();
        String corG = guitarraCorTextField.getText();
        String cordasG = guitarraCordasTextField.getText();

        Guitarra guitarra = new Guitarra(marcaG, modeloG, corG, cordasG);
        System.out.println(guitarra.toString());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText(null);
        alert.setContentText("Marca: " + marcaG + "\nModelo: " + modeloG + "\nCor: " + corG + "\nCordas: " + cordasG);
        alert.showAndWait();
    }
}
