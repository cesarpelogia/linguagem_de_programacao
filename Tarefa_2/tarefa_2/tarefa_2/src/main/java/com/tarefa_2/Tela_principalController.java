package com.tarefa_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Tela_principalController {

        @FXML
        private TextField txtMarca;
        @FXML
        private TextField txtModelo;
        @FXML
        private TextField txtCor;
        @FXML
        private TextField txtCorda;

        @FXML
        private TextField txtMarcaG;
        @FXML
        private TextField txtModeloG;
        @FXML
        private TextField txtCorG;
        @FXML
        private TextField txtCordaG;

        @FXML
        private TextField txtMarcaB;
        @FXML
        private TextField txtModeloB;
        @FXML
        private TextField txtCorB;
        @FXML
        private TextField txtCordaB;

        private Instrumentos_cadastradosController instrumentosController;

        public void setInstrumentosController(Instrumentos_cadastradosController controller) {
                this.instrumentosController = controller;
        }

        @FXML
        void CadastrarViolao(ActionEvent event) {
                Violao violao = new Violao(txtMarca.getText(), txtModelo.getText(), txtCor.getText(),
                                txtCorda.getText());
                System.out.println(
                                "Violão cadastrado: " + violao.marca + " " + violao.modelo + " " + violao.cor + " "
                                                + violao.corda);
                if (instrumentosController != null) {
                        instrumentosController.addViolao(violao);
                }
        }

        @FXML
        void CadastrarGuitarra(ActionEvent event) {
                Guitarra guitarra = new Guitarra(txtMarcaG.getText(), txtModeloG.getText(), txtCorG.getText(),
                                txtCordaG.getText());
                System.out.println("Guitarra cadastrada: " + guitarra.marcaG + " " + guitarra.modeloG + " "
                                + guitarra.corG + guitarra.cordaG);
                if (instrumentosController != null) {
                        instrumentosController.addGuitarra(guitarra);
                }
        }

        @FXML
        void CadastrarBaixo(ActionEvent event) {
                Baixo baixo = new Baixo(txtMarcaB.getText(), txtModeloB.getText(), txtCorB.getText(),
                                txtCordaB.getText());
                System.out.println("Baixo cadastrado: " + baixo.marcaB + " " + baixo.modeloB + " " + baixo.corB + " "
                                + baixo.cordaB);
                if (instrumentosController != null) {
                        instrumentosController.addBaixo(baixo);
                }
        }

}
