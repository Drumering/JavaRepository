package br.com.opet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.opet.conexao.Conexao;
import br.com.opet.model.Aluno;
import br.com.opet.sql.Sql;

public class AlunoDAO {
	protected void salvar(Aluno aluno) {
        Connection connection = Conexao.getConexao();
        try {
            connection.setAutoCommit(false);
            PreparedStatement stmt = connection.prepareStatement(Sql.INSERT);
            stmt.setInt(1,aluno.getRA());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getEndereco());
            stmt.setFloat(5, aluno.getN1());
            stmt.setFloat(6, aluno.getN2());
            stmt.setFloat(7, aluno.getN3());

            int rowsAffected = stmt.executeUpdate();

            if(rowsAffected == 0){
                connection.rollback();
                return;
            }

            connection.commit();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
