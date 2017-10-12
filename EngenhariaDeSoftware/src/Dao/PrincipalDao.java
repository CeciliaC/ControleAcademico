package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexaoPostgres.ConnectionFactory;

public class PrincipalDao {
	
	 private Connection con;


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
