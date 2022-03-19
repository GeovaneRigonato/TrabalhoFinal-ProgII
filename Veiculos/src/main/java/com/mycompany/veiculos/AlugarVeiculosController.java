package com.mycompany.veiculos;

import java.io.IOException;
import java.util.Collections;
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


public class AlugarVeiculosController {
    
    //dia, carro alugar, quem alugou
    
    
    
    
    @FXML
    private DatePicker dataAluguel;
            
    @FXML
    private ComboBox <Veiculo> comboVeiculos;
    private List<Veiculo> veiculos;
    private ObservableList <Veiculo> listarVeiculos;
               
    @FXML
    private ComboBox <Motorista> comboMotoristas;
    private List <Motorista> motoristas;
    private ObservableList <Motorista> listarMotoristas;
    
    @FXML
    public void initialize(){
        Dao<Veiculo> daoVeiculos = new Dao(Veiculo.class);
        
        veiculos = daoVeiculos.listarTodos();
        
        listarVeiculos = FXCollections.observableArrayList(veiculos);
        comboVeiculos.getItems().addAll(listarVeiculos);
        comboVeiculos.setValue(veiculos.get(0));
        
        
         Dao<Motorista> daoMotorista = new Dao(Motorista.class);
        
        motoristas = daoMotorista.listarTodos();
        
        listarMotoristas = FXCollections.observableArrayList(motoristas);
        comboMotoristas.getItems().addAll(listarMotoristas);
        comboMotoristas.setValue(motoristas.get(0));
       
     }
    
    public void alugarCarro(){
        
        try{
            Operacoes op =  new Operacoes();
            op.setDataRetirada(dataAluguel.getValue());
            op.setMotorista(comboMotoristas.getValue());
            op.setVeiculo(comboVeiculos.getValue());
            Dao<Operacoes> daoOp = new Dao(Operacoes.class);
            daoOp.inserir(op);
            
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText("");
            alerta.setContentText("Carro alugado com SUCESSO !! ");
            alerta.showAndWait();
        }
         catch(Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("Erro ao alugar carro");
            alerta.setContentText("Carro não alugado ");
            alerta.showAndWait(); 
        }
        
    }
   
    @FXML
    private void switchToVoltar() throws IOException {
        App.setRoot("Primary");
    }
}