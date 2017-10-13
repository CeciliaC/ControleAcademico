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
    //LISTANDO TODOS OS FUNCIONARIOS
	    
	    
	    public List<Funcionario> listar() throws SQLException {
	        String sql = "SELECT * FROM funcionario";
	        PreparedStatement stmt = this.con.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();

	        List<Funcionario> funcionario = new ArrayList<Funcionario>();

	        while (rs.next()) {
	            Funcionario reg = new Funcionario();
	            reg.setId(rs.getInt("id"));
	            reg.setNome(rs.getString("nome"));
	            reg.setDta_nascimento(rs.getDate("data_de_nascimento"));
	            reg.setTelefone(rs.getInt("telefone"));
	            reg.setEmail(rs.getString("email"));  
	            reg.setDta_ingresso(rs.getDate("data_de_ingresso"));
	            reg.setNivelEscolaridade(rs.getString("nivel_de_escolaridade"));	            
	            reg.setEndereco(rs.getString("endereco"));	            
	            reg.setCpf(rs.getInt("cpf"));
	     
	            
	            
	            funcionario.add(reg);
	        }
	        rs.close();
	        stmt.close();
	        return funcionario;
	    }   
	    
}
