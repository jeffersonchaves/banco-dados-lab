package br.edu.ifpr.app.dao;

import br.edu.ifpr.app.connection.ConnectionFactory;
import br.edu.ifpr.app.model.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    private Connection connection;

    public ContatoDAO(){
        connection = new ConnectionFactory().getConnection();
    }

    public List<Contato> listarContatos() throws SQLException {

        List<Contato> contatos = new ArrayList<>();

        PreparedStatement preparedStatement = this.connection.prepareStatement("SELECT * FROM contatos");

        ResultSet dadosDoBanco = preparedStatement.executeQuery();

        while (dadosDoBanco.next()){

            Contato contato = new Contato();
            contato.setId(dadosDoBanco.getLong("id"));
            contato.setNome(dadosDoBanco.getString("nome"));
            contato.setEmail(dadosDoBanco.getString("email"));
            contato.setEndereco(dadosDoBanco.getString("endereco"));
            contato.setDataNascimento(dadosDoBanco.getDate("data"));

            contatos.add(contato);
        }

        return contatos;
    }

}
