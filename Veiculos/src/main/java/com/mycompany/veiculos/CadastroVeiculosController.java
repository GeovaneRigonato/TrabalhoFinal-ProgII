package com.mycompany.veiculos;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelo.Veiculo;
import util.Dao;

public class CadastroVeiculosController {
    
    @FXML
    private TextField inputMarca;
    
    @FXML
    private TextField inputModelo;
    
    @FXML
    private TextField inputPlaca;
    
    @FXML
    private Button btnInserir;
    
    @FXML
    private Button btnExcluir;
    
    @FXML
    private Button btnToGoBack;
    
    @FXML
    private void inserir(){
        try{
            Veiculo veiculo = new Veiculo();
            veiculo.setMarca(inputMarca.getText());
            veiculo.setModelo(inputModelo.getText());
            veiculo.setPlaca(inputPlaca.getText());

            Dao<Veiculo> dao = new Dao (Veiculo.class);
            dao.inserir(veiculo);
            
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText("");
            alerta.setContentText("Veiculo Inserido");
            alerta.showAndWait(); 
        }
        catch(Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText("Veiculo nao inserido");
            alerta.showAndWait(); 
        }
    }
    
    
    @FXML
    private void switchToVoltar() throws IOException {
        App.setRoot("Primary");
    }
}