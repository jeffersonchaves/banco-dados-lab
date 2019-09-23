package br.edu.ifpr.app.testes;

import br.edu.ifpr.app.connection.ConnectionFactory;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExemploTest {

    public static void main(String[] args) throws SQLException, ParseException {

        Connection connection = new ConnectionFactory().getConnection();

        String sql = "SELECT * FROM contatos";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet resultSet = statement.executeQuery();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");

        while (resultSet.next()){

            System.out.println(resultSet.getString("nome"));
            System.out.println(simpleDateFormat.format(resultSet.getDate("dataNascimento")));

        }


    }
}
