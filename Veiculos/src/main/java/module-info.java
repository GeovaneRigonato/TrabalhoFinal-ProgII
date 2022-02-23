module com {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence; 
    requires org.hibernate.orm.core;
    requires java.sql;
    requires java.base;
    

    opens com.mycompany.veiculos to javafx.fxml;
    opens modelo to org.hibernate.orm.core , javafx.base;

    exports com.mycompany.veiculos;
}