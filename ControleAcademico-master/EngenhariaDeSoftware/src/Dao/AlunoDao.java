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
	    	int a;
            String sql = "INSERT INTO aluno(nome,data_de_ingresso,nivel_de_escolaridade,endereco,data_de_nascimento,cpf,senha,telefone) "+"VALUES(?,?,?,?,?,?,?,?)";  
            String sql1 = "INSERT INTO curso(nome,turno)" + "VALUES(?,?)";
            String sql12 = "INSERT INTO aluno_curso(aluno_id,curso_id)" + "VALUES(?,?)";
            
            String buscasql = "SELECT id.c idcurso" + "FROM curso as c";
      
            try {       
            	
                PreparedStatement stmt = con.prepareStatement(sql);
                PreparedStatement stmt1 = con.prepareStatement(sql1);
                PreparedStatement stmt12 = con.prepareStatement(sql12);
                
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
                
                stmt1.setString(1, aluno.getCurso());
                stmt1.setString(2, aluno.getdepartamento());
                
                stmt12.setInt(1, aluno.getMatricula());             
                stmt12.setInt(2, 1);

                stmt.execute();  
                stmt.close();
                return true;
            } catch (SQLException u) {  
                throw new RuntimeException(u);  
        }  
    }  
	    
	    
 //BUSCAR ALUNO por CPF
	    
	    
	    public Aluno buscar(int cpf) throws SQLException {
	    	 // TODO Auto-generated method stub
	    	 Aluno aluno = new Aluno();
	    	 
	    	 String sql = "Select * from aluno where cpf = ?";
	    	 PreparedStatement ps = con.prepareStatement(sql);
	    	 try {
	    	
	    	 ps.setInt(1,cpf);
	    	 ResultSet rs = ps.executeQuery();
	    	 while (rs.next()){
	    		 aluno.setId(rs.getInt("id"));
		            aluno.setNome(rs.getString("nome"));
		            aluno.setDta_ingresso(rs.getDate("data_de_ingresso"));
		            aluno.setNivelEscolaridade(rs.getString("nivel_de_escolaridade"));	            
		            aluno.setEndereco(rs.getString("endereco"));
		            aluno.setDta_nascimento(rs.getDate("data_de_nascimento"));
		            aluno.setCpf(rs.getInt("cpf"));
		            aluno.setSenha(rs.getString("senha"));
		            aluno.setTelefone(rs.getInt("telefone"));
	    	 }
	    	 ps.close();
	    	 rs.close();
	    	 return aluno;
	    	 
	    	} catch (Exception e) {
	    	 // TODO: handle exception
	    	 }
	    	 return null;
	    	 
	    	}
	    
	    
	    public Aluno buscarEsp(int id) throws SQLException {
	    	 // TODO Auto-generated method stub
	    	 Aluno aluno = new Aluno();
	    	 
	    	 String sql = ""
	    			 + "SELECT a.id, a.nome, a.endereco, a.cpf, a.data_de_nascimento, a.data_de_ingresso, c.nome, c.departamento,a.senha, a.telefone, a.nivel_de_escolaridade "
	    			 + "FROM aluno_curso as x, curso as c, aluno as a "
	    			 + "WHERE x.aluno_id = a.id "
	    			 + "	AND x.curso_id = c.id_curso "
	    			 + "ORDER by x.id asc";
	    	 
	    	 PreparedStatement ps = con.prepareStatement(sql);
	    	 try {
	    	
	    	 ps.setInt(1,id);
	    	 ResultSet rs = ps.executeQuery();
	    	 while (rs.next()){
	    		 aluno.setId(rs.getInt("id"));
		            aluno.setNome(rs.getString("nome"));
		            aluno.setDta_ingresso(rs.getDate("data_de_ingresso"));
		            aluno.setNivelEscolaridade(rs.getString("nivel_de_escolaridade"));	            
		            aluno.setEndereco(rs.getString("endereco"));
		            aluno.setDta_nascimento(rs.getDate("data_de_nascimento"));
		            aluno.setCpf(rs.getInt("cpf"));
		            aluno.setSenha(rs.getString("senha"));
		            aluno.setTelefone(rs.getInt("telefone"));
	    	 }
	    	 ps.close();
	    	 rs.close();
	    	 return aluno;
	    	 
	    	} catch (Exception e) {
	    	 // TODO: handle exception
	    	 }
	    	 return null;
	    	 
	    	}
	    
	    //LISTANDO TODOS OS ALUNOS
	    
	  //Busca com consulta certa :DDDDDD
	    public List<Aluno> listar() throws SQLException {
	        
	    	 String sql = ""
	    			 + "SELECT a.id, a.nome, a.endereco, a.cpf, a.data_de_nascimento, a.data_de_ingresso, c.nome nomecurso, c.departamento, a.id,a.senha, a.telefone, a.nivel_de_escolaridade "
	    			 + "FROM aluno_curso as x, curso as c, aluno as a "
	    			 + "WHERE x.aluno_id = a.id "
	    			 + "	AND x.curso_id = c.id_curso "
	    			 + "ORDER by x.id asc";
	    	
	        PreparedStatement stmt = this.con.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();

	        List<Aluno> aluno = new ArrayList<Aluno>();

	        while (rs.next()) {
	            Aluno reg = new Aluno();
	            reg.setId(rs.getInt("id"));
	            reg.setNome(rs.getString("nome"));
	            reg.setCurso(rs.getString("nomecurso"));
	            reg.setDta_ingresso(rs.getDate("data_de_ingresso"));
	            reg.setNivelEscolaridade(rs.getString("nivel_de_escolaridade"));	          
	            reg.setdepartamento(rs.getString("departamento"));
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
