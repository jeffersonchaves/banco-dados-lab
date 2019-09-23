package br.edu.ifpr.app.testes;

import br.edu.ifpr.app.connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class InsereTeste {

    public static void main(String[] args) throws SQLException {

        Connection connection = new ConnectionFactory().getConnection();


        String sql = "INSERT INTO contatos (nome, email, endereco, dataNascimento) values(?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, "Jefferson");
        statement.setString(2, "jefferson.chaves@ifpr.edu.br");
        statement.setString(3, "rua Minas Gerais");
        statement.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));

        statement.execute();
        statement.close();

    }

}
