package JunitClassesTestes;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//import static org.junit.Assert.assertEquals;
import org.junit.Assert;
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
		
		alunodao.inserir(aluno);
		Assert.assertEquals(123,alunodao.buscar(123).getCpf());

		
	}
	
	@Test //->para rodar o teste remover o comentario de @Test
	public void TesteRemoverAluno() throws SQLException {
		AlunoDao alunodao = new AlunoDao();
		Aluno aluno = new Aluno();
		//CONFERIR ID NO BANCO DE DADOS!!!
		aluno.setId(1);
		alunodao.remove(aluno);
		
		Assert.assertEquals(123,alunodao.buscar(123).getCpf());
//		Assert.assertTrue("Teste Remover executado com sucesso", result);
	}
	
	//@Test //->para rodar o teste remover o comentario de @Test
	public void TesteListandoAluno() throws SQLException {
		AlunoDao alunodao = new AlunoDao();
		int listSize = alunodao.listar().size();
		
		Assert.assertEquals("Teste Listando foi um sucesso",5, listSize);
		//CONFERIR O TAMANHO DA TABELA DE ALUNOS NO BANCO DE DADOS, OU VAI DAR ERRO.
	}
}
