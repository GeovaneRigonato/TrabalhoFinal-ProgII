/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name = "operador") // nome tabela
@DiscriminatorValue("operador")
public class Operador extends Pessoa{
        
    @Column(length = 60)
    private String login;
    
    @Column(length = 60)
    private String senha;

    public Operador(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    

    public Operador(String login, String senha, String nome, Endereco endereço) {
        super(nome, endereço);
        this.login = login;
        this.senha = senha;
    }

    public Operador() {
       this.login = "";
       this.senha = "";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
