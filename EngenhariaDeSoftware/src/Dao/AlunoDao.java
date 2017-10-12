package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Aluno;
import conexaoPostgres.ConnectionFactory;

public class AlunoDao {
	
	 private Connection con;

	    public AlunoDao()  {
	        try {
				this.con = ConnectionFactory.getConexao();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    
	    public void inserir(Aluno aluno){  
            String sql = "INSERT INTO aluno(nome,data_de_ingresso,nivel_de_escolaridade,endereco,data_de_nascimento,cpf,senha,telefones) "+"VALUES(?,?,?,?,?,?,?,?)";  
            try {  
                PreparedStatement stmt = con.prepareStatement(sql);  
                stmt.setString(1, aluno.getNome());  
                java.sql.Date dtingre = new Date(aluno.getDta_ingresso().getTime());
                stmt.setDate(2, dtingre);
                stmt.setString(3,aluno.getNivelEscolaridade());
                
                stmt.setString(4, aluno.getEndereco());
                
                java.sql.Date dtnasc = new Date(aluno.getDta_nascimento().getTime());
                stmt.setDate(5, dtnasc);
                
                stmt.setInt(6, aluno.getCpf());
                stmt.setString(7, aluno.getSenha());
                stmt.setInt(8,aluno.getTelefone());
               
                
                
                
//                stmt.setString(9, aluno.getCurso()); 
//                stmt.setString(10, aluno.getPeriodo()); 
                
                
                stmt.execute();  
                stmt.close();
            } catch (SQLException u) {  
                throw new RuntimeException(u);  
        }  
    }  
	    
	    
}
