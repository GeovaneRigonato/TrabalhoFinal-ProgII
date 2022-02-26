/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.veiculos;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


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
    private void switchToAlterarVeiculo() throws IOException {
        App.setRoot("AlterarVeiculos");
    }
    
    @FXML
    private void switchToBuscar() throws IOException {
        App.setRoot("BuscarVeiculos");
    }

        @FXML
    private void switchToCadastroPessoa() throws IOException {
        App.setRoot("CadastroPessoas");
    }
}
