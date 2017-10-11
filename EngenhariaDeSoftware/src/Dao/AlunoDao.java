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
            String sql = "INSERT INTO Aluno(Nome,DataDeIngresso,NivelDeEscolaridade,Telefone,Endereco,DataDeNascimento,CPF,Senha) "+"VALUES(?,?,?,?,?,?,?,?)";  
            try {  
                PreparedStatement stmt = con.prepareStatement(sql);  
                stmt.setString(1, aluno.getNome());  
                java.sql.Date dtingre = new Date(aluno.getDta_ingresso().getTime());
                stmt.setDate(2, dtingre);
                stmt.setString(3,aluno.getNivelEscolaridade());
                stmt.setInt(4,aluno.getTelefone());
                stmt.setString(5, aluno.getEndereco());
                
                java.sql.Date dtnasc = new Date(aluno.getDta_nascimento().getTime());
                System.out.println(dtnasc);
                stmt.setDate(6, dtnasc);
                stmt.setString(7, aluno.getCpf());
                stmt.setString(8, aluno.getSenha());
               
                
                
                
//                stmt.setString(9, aluno.getCurso()); 
//                stmt.setString(10, aluno.getPeriodo()); 
                
                
                stmt.execute();  
                stmt.close();  
            } catch (SQLException u) {  
                throw new RuntimeException(u);  
        }  
    }  
	    
	    
}
