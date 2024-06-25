// package com.e2.Controller;

// import com.e2.Database.Database;
// import com.e2.Model.Guitarra;

// import javafx.collections.ObservableList;
// import javafx.fxml.FXML;
// import javafx.scene.control.TableColumn;
// import javafx.scene.control.TableView;

// public class ProdutosController {

//     @FXML
//     private TableView<Guitarra> guitarraTableView;

//     @FXML
//     private TableColumn<Guitarra, Integer> idColumn;

//     @FXML
//     private TableColumn<Guitarra, String> marcaColumn;

//     @FXML
//     private TableColumn<Guitarra, String> modeloColumn;

//     @FXML
//     private TableColumn<Guitarra, String> corColumn;

//     @FXML
//     private TableColumn<Guitarra, String> cordasColumn;

//     @FXML
//     private TableColumn<Guitarra, Void> ColumnButton;

//     private ObservableList<Guitarra> guitarraObservableList;

//     private Database database;


//     public void initialize() {
//     //     List<Guitarra> guitarras = database.buscarGuitarras();
//     //     criarTabela(guitarras);
//     //     idColumn.setCellValueFactory(TextFieldTableCell.forTableColumn());
//     //     marcaColumn.setCellValueFactory("marcaG"));
//     //     modeloColumn.setCellValueFactory("modeloG"));
//     //     corColumn.setCellValueFactory("corG"));
//     //     cordasColumn.setCellValueFactory("cordaG"));
//     //     guitarraTableView.setEditable(true);
//     //     editarGuitarras();
//     // }

//     //     void criarTabela(List<Guitarra> guitarras) {
//     //         guitarraObservableList = FXCollections.observableArrayList(guitarras);

//     //     idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
//     //     marcaColumn.setCellValueFactory(new PropertyValueFactory<>("marcaG"));
//     //     modeloColumn.setCellValueFactory(new PropertyValueFactory<>("modeloG"));
//     //     corColumn.setCellValueFactory(new PropertyValueFactory<>("corG"));
//     //     cordasColumn.setCellValueFactory(new PropertyValueFactory<>("cordaG"));

//     //     ColumnButton.setCellFactory(param -> new TableCell<Guitarra, Void>(){
//     //         private final Button button = new Button("Deletar");

//     //         @Override
//     //         protected void updateItem(Void item, boolean empty) {
//     //             super.updateItem(item, empty);
//     //             if (empty) {
//     //                 setText(null);
//     //             } else {
//     //                 button.setOnAction(event -> {
//     //                     Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//     //                     alert.setTitle("Confirmação");
//     //                     alert.setHeaderText("Deseja deletar esta guitarra?");

//     //                     ButtonType ButtonTypeSim = new ButtonType("Sim", ButtonData.YES);
//     //                     ButtonType ButtonTypeNao = new ButtonType("Não", ButtonData.NO);

//     //                     alert.getButtonTypes().setAll(ButtonTypeSim, ButtonTypeNao);

//     //                     Optional<ButtonType> result = alert.showAndWait();
//     //                     if (result.isPresent() && result.get() == ButtonTypeSim) {
//     //                         Guitarra guitarra = getTableView().getItems().get(getIndex());
//     //                         database.deletarGuitarra();

//     //                     }
//     //                 });
//     //                 setGraphic(button);
//     //             }
//     //         }
//     //     });




//         guitarraTableView.setItems(guitarraObservableList);
//     }
// }
