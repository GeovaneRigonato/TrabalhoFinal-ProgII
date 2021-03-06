package com.mycompany.veiculos;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import modelo.Buscador;
import modelo.Endereco;
import modelo.Motorista;
import util.Dao;

public class CadastroMotoristaController{

    @FXML
    private TextField inputNome;
    @FXML
    private TextField inputCep;
    @FXML
    private TextField inputCNH;
    @FXML
    private TextField inputLogradouro;
    @FXML
    private TextField inputBairro;
    @FXML
    private TextField inputLocalidade;
    @FXML
    private TextField inputUF;
        
    Motorista  motorista = new Motorista();
    
    private static Endereco endereco = new Endereco();
    
    @FXML
    private void buscarCEP() throws IOException{
        
        Buscador buscador = new Buscador();
            try{
            endereco = buscador.buscar(inputCep.getText());
            inputLogradouro.setText(endereco.getLogradouro());
            inputBairro.setText(endereco.getBairro());
            inputLocalidade.setText(endereco.getLocalidade());
            inputUF.setText(endereco.getUf());
            }catch(Exception e){
                Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText("Cep não encontrado");
                System.out.println(e.getMessage());
            alerta.showAndWait(); 
            }
    }
    @FXML
    private void inserir(){
        try{
            
            motorista.setNome(inputNome.getText());
            motorista.setCnh(inputCNH.getText());
            motorista.setSecao("");
//          motorista.getEndereço().setBairro(inputBairro.getText());
            motorista.setEndereço(endereco);
            

            Dao<Motorista> dao = new Dao (Motorista.class);
            dao.inserir(motorista);
            
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText("");
            alerta.setContentText("Motorista Inserido");
            alerta.showAndWait(); 
        }
        catch(Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText("Motorista não inserido"+e.getMessage());
            alerta.showAndWait(); 
        }
    }
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Primary");
    }
}
