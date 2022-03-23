package com.mycompany.veiculos;

import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import modelo.Motorista;
import modelo.Operacoes;
import modelo.Veiculo;
import util.Dao;


public class DevolverVeiculosController {    
    @FXML
    private DatePicker dataDevolucao;
            
    @FXML
    private ComboBox <Operacoes> comboOperacoes;
    private List<Operacoes> operacoes;
    private ObservableList <Operacoes> listarOperacoes;
    
    
    
    @FXML
    public void initialize(){
        Dao<Operacoes> daoOperacoes = new Dao(Operacoes.class);
        
              
        operacoes = daoOperacoes.listarTodos();
        
        listarOperacoes = FXCollections.observableArrayList(operacoes);
        comboOperacoes.getItems().addAll(listarOperacoes);
        comboOperacoes.setValue(operacoes.get(0));
        
        
       
       
     }
    
    public void devolverCarro(){
        
        try{
            Operacoes op =  comboOperacoes.getValue();
            op.setDataDevolucao(dataDevolucao.getValue());
                    
            
            Dao<Operacoes> daoOp = new Dao(Operacoes.class);
            daoOp.alterar(op);
            
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText("");
            alerta.setContentText("Carro devolvido com SUCESSO !! ");
            alerta.showAndWait();
        }
         catch(Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText("Erro ao devolver carro.");
            System.out.println("cara "+ e.getMessage());
            alerta.showAndWait(); 
        }
        
    }
   
    @FXML
    private void switchToVoltar() throws IOException {
        App.setRoot("Primary");
    }
}