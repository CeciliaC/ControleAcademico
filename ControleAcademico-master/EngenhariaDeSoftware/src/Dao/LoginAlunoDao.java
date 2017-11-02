package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Interface.LoginAluno;
import conexaoPostgres.ConnectionFactory;

public class LoginAlunoDao {
	
	private Connection con;
	
	 public LoginAlunoDao()  {
	        try {
				this.con = ConnectionFactory.getConexao();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	public String getNome() {
		System.out.println("getNome()");
		String sql = "SELECT id,nome FROM aluno where id=?";
		PreparedStatement stm;
		String nome = "";
        try {
			stm = con.prepareStatement(sql);
			//stm.setString(1, nome);
			ResultSet rs = stm.executeQuery();
			nome = rs.getString("nome");
			
		} catch (SQLException e) {
			System.out.println("nao peguei as informacoes");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("nome: " + nome);
        return nome;
	}
	
	public void getPerfil() {
		String sql = "SELECT nome,curso,data_de_nascimento, endereco FROM aluno";
    	
        PreparedStatement stm;
        try {
			stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			
			
		} catch (SQLException e) {
			System.out.println("nao peguei as informacoes");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
