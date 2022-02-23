package com.mycompany.veiculos;

import java.io.IOException;
import javafx.fxml.FXML;


public class AlterarVeiculosController {
    
   
    @FXML
    private void switchToVoltar() throws IOException {
        App.setRoot("Primary");
    }
}