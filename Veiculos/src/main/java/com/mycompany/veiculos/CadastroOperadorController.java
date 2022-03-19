package com.mycompany.veiculos;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import modelo.Buscador;
import modelo.Endereco;
import modelo.Operador;
import util.Dao;

public class CadastroOperadorController {

    @FXML
    private TextField inputNome;
    @FXML
    private TextField inputLogin;
    @FXML
    private TextField inputSenha;
    @FXML
    private TextField inputCep;
    @FXML
    private TextField inputLogradouro;
    @FXML
    private TextField inputBairro;
    @FXML
    private TextField inputLocalidade;
    @FXML
    private TextField inputUF;
    
    private static Operador operador = new Operador();
    
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
            
            operador.setNome(inputNome.getText());
            operador.setLogin(inputLogin.getText());
            operador.setSenha(inputSenha.getText());
            

            operador.setEndereço(endereco);
            

            Dao<Operador> dao = new Dao (Operador.class);
            dao.inserir(operador);
            
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText("");
            alerta.setContentText("Operador Inserido");
            alerta.showAndWait(); 
        }
        catch(Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText("Operador não inserido"+e.getMessage());
            alerta.showAndWait(); 
        }
    }
    
    
    
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Primary");
    }
}
