package com.e2.Controller;

import java.util.List;

import com.e2.Model.Guitarra;
import com.e2.Service.ProdutosService;

import javafx.beans.property.SimpleStringProperty; // Add this import statement
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

public class ProdutosController {

    @FXML
    private TableView<Guitarra> guitarraTableView;

    @FXML
    private TableColumn<Guitarra, String> marcaColumn;

    @FXML
    private TableColumn<Guitarra, String> modeloColumn;

    @FXML
    private TableColumn<Guitarra, String> corColumn;

    @FXML
    private TableColumn<Guitarra, String> cordasColumn;

    @FXML
    private ProdutosService produtosService = new ProdutosService();

    public void initialize() {
        System.out.println("ProdutosController inicializado");
        criarTabelaGuitarras();
        carregarGuitarras();
    }

    public void criarTabelaGuitarras() {
        // idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        marcaColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarcaG()));
        modeloColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModeloG()));
        corColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorG()));
        cordasColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCordaG()));
        TableColumn<Guitarra, Void> colunaDeletar = new TableColumn<>("Deletar");


        Callback<TableColumn<Guitarra, Void>, TableCell<Guitarra, Void>> cellFactory = new Callback<>() {
            @Override
            public TableCell<Guitarra, Void> call(final TableColumn<Guitarra, Void> param) {
                final TableCell<Guitarra, Void> cell = new TableCell<>() {
                    private final Button btn = new Button("Deletar");
                    {
                        btn.setOnAction((ActionEvent event) -> {
                            Guitarra guitarra = getTableView().getItems().get(getIndex());
                            try {
                                ProdutosController.this.produtosService.deletarGuitarra(guitarra);
                                ProdutosController.this.carregarGuitarras();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        });
                    }
                    @Override
                    protected void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(btn);
                        }
                    }
                };
                return cell;
            }
        };

        marcaColumn.setStyle("-fx-aligment: CENTER;");
        modeloColumn.setStyle("-fx-aligment: CENTER;");
        corColumn.setStyle("-fx-aligment: CENTER;");
        cordasColumn.setStyle("-fx-aligment: CENTER;");
        colunaDeletar.setCellFactory(cellFactory);
        guitarraTableView.getColumns().add(colunaDeletar);
    }

    public void carregarGuitarras() {
            List<Guitarra> listaGuitarras = produtosService.buscarGuitarras();
            ObservableList<Guitarra> observableList = FXCollections.observableList(listaGuitarras);
            guitarraTableView.setItems(observableList);
    }
}
