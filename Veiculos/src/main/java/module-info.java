module com {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence; 
    requires org.hibernate.orm.core;
    requires java.sql;
    requires java.base;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    

    opens com.mycompany.veiculos to javafx.fxml;
    opens modelo to org.hibernate.orm.core , javafx.base;

    exports com.mycompany.veiculos;
    exports modelo;
}