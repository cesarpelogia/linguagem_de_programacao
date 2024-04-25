package com.e1.Controller;

import com.e1.Model.Baixo;
import com.e1.Model.Guitarra;
import com.e1.Model.Violao;

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
    private Button salvarGuitarraButton;

    @FXML
    private TextField baixoMarcaTextField;

    @FXML
    private TextField baixoModeloTextField;

    @FXML
    private TextField baixoCorTextField;

    @FXML
    private TextField baixoCordasTextField;

    @FXML
    private Button salvarBaixoButton;

    @FXML
    private TextField violaoMarcaTextField;

    @FXML
    private TextField violaoModeloTextField;

    @FXML
    private TextField violaoCorTextField;

    @FXML
    private TextField violaoCordasTextField;

    @FXML
    private Button salvarViolaoButton;

    @FXML
    public void salvarGuitarra() {
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

    @FXML
    public void salvarBaixo() {
        String marcaB = baixoMarcaTextField.getText();
        String modeloB = baixoModeloTextField.getText();
        String corB = baixoCorTextField.getText();
        String cordasB = baixoCordasTextField.getText();

        Baixo baixo = new Baixo(marcaB, modeloB, corB, cordasB);
        System.out.println(baixo.toString());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText(null);
        alert.setContentText("Marca: " + marcaB + "\nModelo: " + modeloB + "\nCor: " + corB + "\nCordas: " + cordasB);
        alert.showAndWait();

    }

    @FXML
    public void salvarViolao() {
        String marcaV = violaoMarcaTextField.getText();
        String modeloV = violaoModeloTextField.getText();
        String corV = violaoCorTextField.getText();
        String cordasV = violaoCordasTextField.getText();

        Violao violao = new Violao(marcaV, modeloV, corV, cordasV);
        System.out.println(violao.toString());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText(null);
        alert.setContentText("Marca: " + marcaV + "\nModelo: " + modeloV + "\nCor: " + corV + "\nCordas: " + cordasV);
        alert.showAndWait();
    }
}
