/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.veiculos;
import java.io.IOException;
import javafx.fxml.FXML;



public class PrimaryController {
       
     
    @FXML
    private void switchToCadastroVeiculo() throws IOException {
        App.setRoot("CadastroVeiculos");
    }
    
    @FXML
    private void switchToListar() throws IOException {
        App.setRoot("ListarVeiculos");
    }
    
    @FXML
    private void switchToAlugarVeiculo() throws IOException {
        App.setRoot("AlugarVeiculos");
    }
    @FXML
    private void switchToDevolverVeiculo() throws IOException {
        App.setRoot("DevolverVeiculos");
    }
    
    @FXML
    private void switchToBuscar() throws IOException {
        App.setRoot("BuscarVeiculos");
    }

    @FXML
    private void switchToCadastroMotorista() throws IOException {
        App.setRoot("CadastroMotorista");
    }
    
    @FXML
    private void switchToCadastroOperador() throws IOException {
        App.setRoot("CadastroOperador");
    }
}
