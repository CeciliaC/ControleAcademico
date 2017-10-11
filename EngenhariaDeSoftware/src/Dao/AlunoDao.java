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
            String sql = "INSERT INTO teste(nome,endereco,cpf,dta_nascimento,dta_ingresso,curso,periodo,matricula) VALUES(?,?,?,?,?,?,?,?)";  
            try {  
                PreparedStatement stmt = con.prepareStatement(sql);  
                stmt.setString(1, aluno.getNome());  
                stmt.setString(2, aluno.getEndereco());
                stmt.setString(3, aluno.getCpf()); 
                
                java.sql.Date dtnasc = new Date(aluno.getDta_nascimento().getTime());
                System.out.println(dtnasc);
                stmt.setDate(4, dtnasc);
                java.sql.Date dtingre = new Date(aluno.getDta_ingresso().getTime());
                stmt.setDate(5, dtingre);
                
                
                stmt.setString(6, aluno.getCurso()); 
                stmt.setString(7, aluno.getPeriodo()); 
                stmt.setInt(8, aluno.getMatricula()); 
                
                stmt.execute();  
                stmt.close();  
            } catch (SQLException u) {  
                throw new RuntimeException(u);  
        }  
    }  
	    
	    
}
