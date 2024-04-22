package com.tarefa_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class Instrumentos_cadastradosController {
    @FXML
    public ListView<Violao> listView;

    @FXML
    public ListView<Guitarra> listViewG;

    @FXML
    public ListView<Baixo> listViewB;

    private ObservableList<Violao> violaos = FXCollections.observableArrayList();
    private ObservableList<Guitarra> guitarras = FXCollections.observableArrayList();
    private ObservableList<Baixo> baixos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        listView.setItems(violaos);
        listViewG.setItems(guitarras);
        listViewB.setItems(baixos);
    }

    public void addViolao(Violao violao) {
        violaos.add(violao);
    }

    public void addGuitarra(Guitarra guitarra) {
        guitarras.add(guitarra);
    }

    public void addBaixo(Baixo baixo) {
        baixos.add(baixo);
    }

    public ObservableList<Violao> getViolaos() {
        return violaos;
    }

    public ObservableList<Guitarra> getGuitarras() {
        return guitarras;
    }

    public ObservableList<Baixo> getBaixos() {
        return baixos;
    }

}
