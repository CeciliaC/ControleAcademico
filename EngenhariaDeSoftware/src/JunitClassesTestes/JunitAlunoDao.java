package JunitClassesTestes;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import Dao.AlunoDao;
import Model.Aluno;

public class JunitAlunoDao {
	
	@Test
	public void TesteInserirAluno() throws SQLException, ParseException {
		AlunoDao alunodao = new AlunoDao();
		Aluno aluno = new Aluno();
		
		aluno.setNome("fulano");
		aluno.setCpf(123);
		aluno.setEndereco("Rua tal");
		    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	        Date d_nas = df.parse("10/10/2010");
	    aluno.setDta_nascimento(d_nas);
	    	    	Date d_ing = df.parse("10/10/1910");
		aluno.setDta_ingresso(d_ing);
		aluno.setCurso("ciencia computacao");
		aluno.setdepartamento("informatica");
		aluno.setMatricula(121990);
		aluno.setSenha("123");
		aluno.setTelefone(123);
		aluno.setNivelEscolaridade("default");
		
		assertEquals("Teste Inserir foi um sucesso",true,alunodao.inserir(aluno));
		
	}
	
	@Test
	public void TesteRemoverAluno() throws SQLException {
		AlunoDao alunodao = new AlunoDao();
		Aluno aluno = new Aluno();
		aluno.setId(2);
		assertEquals("Teste Remover foi um sucesso",true,alunodao.remove(aluno));
		
	}
	
	
	@Test
	public void TesteListandoAluno() throws SQLException {
		AlunoDao alunodao = new AlunoDao();
		assertEquals("Teste Listando foi um sucesso",2,alunodao.listar().size());
		
	}
}
