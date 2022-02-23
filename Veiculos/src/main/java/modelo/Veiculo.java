package modelo;

import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table; 

@Entity // objetos dessa classe sao objetos que podem ser gravados como arquivos
@Table (name = "Veiculo")// obrigatório

public class Veiculo {
    @Id //  controlar o Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerar Id automatico
    
    private Integer id;
    
    @Column(length = 30) //determinar a quantidade de caracteres
    private String marca;
    @Column(length = 30) //determinar a quantidade de caracteres
    private String modelo;
    @Column(length = 8) //determinar a quantidade de caracteres
    private String placa;
    

    public Veiculo(){//construtor vazio
        this.marca = "";
        this.modelo = "";
        this.placa = "";
    }
    
    public Veiculo(String marca, String modelo, String placa) {//construtor
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    
    @Override
    public String toString(){
        return "Marca->" + marca + " - " +"Modelo->" + modelo + " - " +"Placa->" + placa;
    }
    
//----------------  get e set de tudo ------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
