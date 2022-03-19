/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.veiculos;

import java.io.IOException;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import modelo.Operador;
import util.Dao;



public class TelaLoginController{
    
    @FXML
    private TextField inputLogin;
    
    @FXML
    private TextField inputSenha;

    @FXML
    private void login() throws IOException{
        boolean achou = false;
        Dao<Operador> dao = new Dao(Operador.class);
        Operador operador = new Operador();
        operador.setLogin(inputLogin.getText());
        operador.setSenha(inputSenha.getText());
        List<Operador> lista = dao.listarTodos();
            for(Operador o: lista){
                if(o.getLogin().equalsIgnoreCase(operador.getLogin())){
                    if(o.getSenha().equalsIgnoreCase(operador.getSenha())){
                        achou = true;
                        App.setRoot("primary");
                    }else{
                        Alert aviso = new Alert(Alert.AlertType.ERROR);
                        aviso.setHeaderText("");
                        aviso.setContentText("Senha Incorreta!");
                        aviso.showAndWait();
                        return;
                    }
                }
            }
        
        
        
    }
    
    
}
