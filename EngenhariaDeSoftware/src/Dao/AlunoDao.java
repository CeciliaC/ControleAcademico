package Dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Aluno;
import conexaoPostgres.ConnectionFactory;

public class AlunoDao {
	
	 private Connection con;


	    public AlunoDao()  {
	        try {
				this.con = ConnectionFactory.getConexao();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    }
	  // INSERINDO ALUNOS  
	    
	    public boolean inserir(Aluno aluno){  
            String sql = "INSERT INTO aluno(nome,data_de_ingresso,nivel_de_escolaridade,endereco,data_de_nascimento,cpf,senha,telefone) "+"VALUES(?,?,?,?,?,?,?,?)";  
            
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
                
             
                stmt.execute();  
                stmt.close();
                return true;
            } catch (SQLException u) {  
                throw new RuntimeException(u);  
        }  
    }  
	    
	    //LISTANDO TODOS OS ALUNOS
	    
	    
	    public List<Aluno> listar() throws SQLException {
	        String sql = "SELECT * FROM aluno";
	        PreparedStatement stmt = this.con.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();

	        List<Aluno> aluno = new ArrayList<Aluno>();

	        while (rs.next()) {
	            Aluno reg = new Aluno();
	            reg.setId(rs.getInt("id"));
	            reg.setNome(rs.getString("nome"));
	            reg.setDta_ingresso(rs.getDate("data_de_ingresso"));
	            reg.setNivelEscolaridade(rs.getString("nivel_de_escolaridade"));	            
	            reg.setEndereco(rs.getString("endereco"));
	            reg.setDta_nascimento(rs.getDate("data_de_nascimento"));
	            reg.setCpf(rs.getInt("cpf"));
	            reg.setSenha(rs.getString("senha"));
	            reg.setTelefone(rs.getInt("telefone"));
	            
	            
	            aluno.add(reg);
	        }
	        rs.close();
	        stmt.close();
	        return aluno;
	    }
	    // REMOVER ALUNO
	    public boolean remove(Aluno id) throws SQLException {
	        String sql = "DELETE FROM aluno where id=?";
	        PreparedStatement stmt = con.prepareStatement(sql);
	        stmt.setInt(1, id.getId());
	        stmt.execute();
	        stmt.close();
			return true;
	    }

		

}
