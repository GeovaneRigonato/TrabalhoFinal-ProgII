
package modelo;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table(name = "operacoes") // nome tabela
@DiscriminatorValue("operacoes") // identificador da subclasse
public class Operacoes {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @JoinColumn(name="veiculo", referencedColumnName="id")
    @ManyToOne(optional=false, cascade=CascadeType.MERGE)
    private Veiculo veiculo;
    
    
    @JoinColumn(name="motorista", referencedColumnName="id")
    @ManyToOne(optional=false, cascade=CascadeType.MERGE)
    private Motorista motorista;

    @Column
    @Temporal(TemporalType.DATE)
    private LocalDate dataRetirada;
    
    @Column
    @Temporal(TemporalType.DATE)
    private LocalDate dataDevolucao;
    
    public Integer getId(){
        return id;
    }
    
    public void SetId(Integer id){
        this.id=id;
    }
    
    public Veiculo getVeiculo(){
        return veiculo;
    }
    
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public Motorista getMotorista(){
        return motorista;
    }
    
    public void setMotorista(Motorista motorista){
        this.motorista = motorista;
    }
    
    public LocalDate getDataRetirada(){
        return dataRetirada;
    }
    
    public void setDataRetirada(LocalDate dataRetirada){
        this.dataRetirada = dataRetirada;
    }
    
    public LocalDate getDataDevolucao(){
        return dataDevolucao;
    }
    
    public void setDataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    
    public String toString(){
        return this.getMotorista() + "--" + this.getVeiculo();
    }
    
    
    
    
    
    
}
