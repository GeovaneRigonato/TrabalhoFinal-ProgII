package util;

import java.util.List;
import modelo.Veiculo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;




public class DaoTest {
    
    public DaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
        @Test
    public void testInserir(){
        Dao<Veiculo> dao = new Dao(Veiculo.class);
        List<Veiculo> lista = dao.listarTodos();
        
        for (Veiculo v : lista) {
            System.out.println(v);
        }
    }
}


//    @Test
//    public void testInserir(){
//        Veiculo v = new Veiculo ("Ford","Camaro","ABC1234");
//        Dao<Veiculo> dao = new Dao(Veiculo.class);
//        dao.inserir(v);
//    }
    

    
//    @Test
//    public void testInserirMotorista(){
//        Endereco end = new Endereco();
//        end.setCep("18701-121");
//        end.setLocalidade("Avaré");
//        end.setLogradouro("Alameda das aroeiras");
//        end.setUf("SP");
//        Motorista m = new Motorista("23556213456", "almoxarifado","Robertinho",end);
//        Dao<Motorista> dao = new Dao(Motorista.class);
//        dao.inserir(m);
//    }
//}
