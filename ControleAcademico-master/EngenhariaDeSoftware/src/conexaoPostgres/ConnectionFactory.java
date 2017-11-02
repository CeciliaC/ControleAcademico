package conexaoPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Conectado ao banco!");
            return DriverManager.getConnection ("jdbc:postgresql://localhost:5437/V2","postgres","PPMN12345678");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }

}