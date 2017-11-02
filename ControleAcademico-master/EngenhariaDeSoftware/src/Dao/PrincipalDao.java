package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import Model.Aluno;
import conexaoPostgres.ConnectionFactory;

public class PrincipalDao {
	
	 private Connection con;
	 private Aluno a = new Aluno();


	    public PrincipalDao()  {
	        try {
				this.con = ConnectionFactory.getConexao();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    
	    public boolean buscarLoginAluno(int login, String senha) {
	    	
	    	String sql = "SELECT id,senha FROM aluno WHERE id=? and senha=?";
	    	
            PreparedStatement stm;
			try {
				stm = con.prepareStatement(sql);
				 stm.setInt(1, login);
		            stm.setString(2, senha);

		            ResultSet rs = stm.executeQuery();

		            if (rs.next())
		            {
		                System.out.println("Logando Aluno");
		                criarAluno(login, senha);
		                return true;
		            } else
		            {
		                System.out.println("login ou senha incorretos");
		            }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           

	    	return false;
	    }
	    
	    public void criarAluno(int login, String senha) {
	    	int id;
	    	String nome;
	    	String endereco;
	    	int cpf;
	    	Date dta_nascimento;
	    	Date dta_ingresso;
	    	String curso;
	    	String periodo;
	    	int matricula;
	    	int telefone;
	    	String nivelEscolaridade;
	    	a.setId(login);
	    	
	    	String sql = "SELECT id,nome,data_de_ingresso,nivel_de_escolaridade,endereco,data_de_nascimento,cpf,telefone"
	    			+ " FROM aluno WHERE id=?";
	    	PreparedStatement stm;
	    	try {
				stm = con.prepareStatement(sql);
				stm.setInt(1, login);
	            ResultSet rs = stm.executeQuery();
	            if(rs.next()){
	            	System.out.println("nome: " + rs.getString("nome"));
	            	a.setNome(rs.getString("nome"));
	            	a.setDta_ingresso(rs.getDate("data_de_ingresso"));
	            	a.setNivelEscolaridade(rs.getString("nivel_de_escolaridade"));
	            	a.setEndereco(rs.getString("endereco"));
	            	a.setDta_nascimento(rs.getDate("data_de_nascimento"));
	            	a.setCpf(rs.getInt("cpf"));
	            	a.setTelefone(rs.getInt("telefone"));
	            }
	            
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
	    	
	    }
	    
	    public Aluno getAluno() {
	    	return a;
	    }
	    
	    public boolean buscarLoginAdmin(int login, String senha) {
	    	String sql = "SELECT id,senha FROM admin WHERE id=? and senha=?";
	    	
            PreparedStatement stm;
			try {
				stm = con.prepareStatement(sql);
				 stm.setInt(1, login);
		            stm.setString(2, senha);

		            ResultSet rs = stm.executeQuery();

		            if (rs.next())
		            {
		                System.out.println("Logando Administrador");
		                return true;
		            } else
		            {
		                System.out.println("login ou senha incorretos");
		            }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return false;
	    }
}
