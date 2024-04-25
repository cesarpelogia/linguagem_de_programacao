package com.e1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import javafx.fxml.FXML;
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

        Map<String, String> guitarra = new HashMap<>();
        guitarra.put("marca", marcaG);
        guitarra.put("modelo", modeloG);
        guitarra.put("cor", corG);
        guitarra.put("cordas", cordasG);

        Gson gson = new Gson();
        String json = gson.toJson(guitarra);

        try (FileWriter writer = new FileWriter("guitarra.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void salvarBaixo() {
        String marcaB = baixoMarcaTextField.getText();
        String modeloB = baixoModeloTextField.getText();
        String corB = baixoCorTextField.getText();
        String cordasB = baixoCordasTextField.getText();

        Map<String, String> baixo = new HashMap<>();
        baixo.put("marca", marcaB);
        baixo.put("modelo", modeloB);
        baixo.put("cor", corB);
        baixo.put("cordas", cordasB);

        Gson gson = new Gson();
        String json = gson.toJson(baixo);

        try (FileWriter writer = new FileWriter("baixo.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void salvarViolao() {
        String marcaV = violaoMarcaTextField.getText();
        String modeloV = violaoModeloTextField.getText();
        String corV = violaoCorTextField.getText();
        String cordasV = violaoCordasTextField.getText();

        Map<String, String> violao = new HashMap<>();
        violao.put("marca", marcaV);
        violao.put("modelo", modeloV);
        violao.put("cor", corV);
        violao.put("cordas", cordasV);

        Gson gson = new Gson();
        String json = gson.toJson(violao);

        try (FileWriter writer = new FileWriter("violao.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
