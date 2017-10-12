package Dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Aluno;
import Model.Funcionario;
import conexaoPostgres.ConnectionFactory;

public class FuncionarioDao {
	
	 private Connection con;


	    public FuncionarioDao()  {
	        try {
				this.con = ConnectionFactory.getConexao();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    }
	    
	    
	    public void inserir(Funcionario funcionario){  
            String sql = "INSERT INTO funcionario(nome,data_de_nascimento,telefone,email,data_de_ingresso,nivel_de_escolaridade,endereco,cpf,senha) "+"VALUES(?,?,?,?,?,?,?,?,?)";  
            try {  
                PreparedStatement stmt = con.prepareStatement(sql);  
                stmt.setString(1, funcionario.getNome()); 
                java.sql.Date dtnasc = new Date(funcionario.getDta_nascimento().getTime());
                stmt.setDate(2, dtnasc);
                stmt.setInt(3,funcionario.getTelefone());
                stmt.setString(4,funcionario.getEmail());
                java.sql.Date dtingre = new Date(funcionario.getDta_ingresso().getTime());
                stmt.setDate(5, dtingre);
                stmt.setString(6,funcionario.getNivelEscolaridade());
                stmt.setString(7, funcionario.getEndereco());
                stmt.setInt(8, funcionario.getCpf());
                stmt.setString(9, funcionario.getSenha());
               
//                stmt.setString(9, aluno.getCurso()); 
//                stmt.setString(10, aluno.getPeriodo()); 
                               
                stmt.execute();  
                stmt.close();
            } catch (SQLException u) {  
                throw new RuntimeException(u);  
        }  
    }  
	    
	    
}
