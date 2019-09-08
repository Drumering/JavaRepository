package br.com.opet.sql;

public class Sql {
	public static final String INSERT = "INSERT INTO Aluno values(?,?,?,?,?,?,?,?);";
    public static final String SELECT = "SELECT * FROM Aluno;";
    public static final String SELECT_RA = "SELECT * FROM Aluno WHERE RA = ?;";
    public static final String DELETE_RA = "DELETE FROM Aluno WHERE RA = ?";
    public static final String UPDATE_RA = "UPDATE Aluno SET " +
            "nome = ?, " +
            "email = ?, " +
            "endereco = ?, " +
            "N1 = ?," +
            "N2 = ?," +
            "N3 = ?," +
            "media = ? " +
            "WHERE RA = ?;";
}
