package br.edu.ifpr.app.testes;

import br.edu.ifpr.app.connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasTeste {

    public static void main(String[] args) throws SQLException {

        Connection connection = new ConnectionFactory().getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM contatos");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getString("nome"));
            System.out.println(resultSet.getString("endereco"));
            System.out.println(resultSet.getDate("dataNascimento"));
            System.out.println("\n");
        }

    }

}
