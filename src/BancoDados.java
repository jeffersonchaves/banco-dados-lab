import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDados {

    public static void main(String[] args) throws SQLException {

        System.out.println("Banco de dados");

        String dsn = "jdbc:mysql://localhost/myagenda";
        Connection connection = DriverManager.getConnection(dsn, "jefferson", "jefferson");

        String sql = "INSERT INTO contatos (nome, email, endereco, dataNascimento) values('jefferson', 'jefferson.chaves@ifpr.edu.br', 'rua MG', '2019/09/16')";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
        statement.close();

    }

}
