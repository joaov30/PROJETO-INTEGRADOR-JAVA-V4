package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    
    public Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/hardwarecore", "root", "");
        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.",erro);
        }

    }
}
