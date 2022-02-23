package util;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaUtil implements Serializable {
    private static final EntityManagerFactory factory; // quem conversa com o banco de dados.
    static {
        factory = Persistence.createEntityManagerFactory("VeiculoPU");
    }
    
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
    public static void close() {
        factory.close();
    }
    
}