package com.e2.Controller;

import java.util.List;

import com.e2.Model.Guitarra;
import com.e2.Service.ProdutosService;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    private TextField marcaGTextField;

    @FXML
    private TextField modeloGTextField;

    @FXML
    private TextField corGTextField;

    @FXML
    private TextField cordaGTextField;

    @FXML
    private Button botaoAtualizar;
    @FXML
    private ProdutosService produtosService = new ProdutosService();

    public void initialize() {
        System.out.println("ProdutosController inicializado");
        criarTabelaGuitarras();
        carregarGuitarras();
        botaoAtualizar.setOnAction(event -> editarGuitarra());
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

        marcaColumn.setStyle("-fx-alignment: CENTER;");
        modeloColumn.setStyle("-fx-alignment: CENTER;");
        corColumn.setStyle("-fx-alignment: CENTER;");
        cordasColumn.setStyle("-fx-alignment: CENTER;");
        colunaDeletar.setCellFactory(cellFactory);
        guitarraTableView.getColumns().add(colunaDeletar);
    }

    
    @FXML
    public void editarGuitarra() {
        Guitarra guitarraAtualizada = guitarraTableView.getSelectionModel().getSelectedItem();
        if (guitarraAtualizada != null) {
            try {
                String marca = marcaGTextField.getText();
                String modelo = modeloGTextField.getText();
                String cor = corGTextField.getText();
                String corda = cordaGTextField.getText();
                
                if (marca.isEmpty() || modelo.isEmpty() || cor.isEmpty() || corda.isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Aviso");
                    alert.setHeaderText(null);
                    alert.setContentText("Por favor, preencha todos os campos antes de atualizar.");
                    alert.showAndWait();
                    return;
                }
                
                guitarraAtualizada.setMarcaG(marca);
                guitarraAtualizada.setModeloG(modelo);
                guitarraAtualizada.setCorG(cor);
                guitarraAtualizada.setCordaG(corda);
                System.out.println(guitarraAtualizada);
                produtosService.atualizarGuitarra(guitarraAtualizada);
                carregarGuitarras();
    
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Informação");
                alert.setHeaderText(null);
                alert.setContentText("Guitarra atualizada com sucesso!");
                alert.showAndWait();
    
                limparCampos();
            } catch (Exception e) {
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setTitle("Erro");
                errorAlert.setHeaderText("Erro ao atualizar a guitarra");
                errorAlert.setContentText(e.getMessage());
                errorAlert.showAndWait();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Aviso");
            alert.setHeaderText(null);
            alert.setContentText("Nenhuma guitarra selecionada.");
            alert.showAndWait();
        }
    }

    private void limparCampos() {
        marcaGTextField.clear();
        modeloGTextField.clear();
        corGTextField.clear();
        cordaGTextField.clear();
    }



    public void carregarGuitarras() {
            List<Guitarra> listaGuitarras = produtosService.buscarGuitarras();
            ObservableList<Guitarra> observableList = FXCollections.observableList(listaGuitarras);
            guitarraTableView.setItems(observableList);
    }
}
