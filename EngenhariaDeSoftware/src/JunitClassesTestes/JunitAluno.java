package JunitClassesTestes;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import Dao.AlunoDao;
import Model.Aluno;

public class JunitAluno {
	@Test
	public void TestandoAluno() {
		Aluno aluno = new Aluno();
		aluno.setNome("fulano");
		aluno.setCpf(123);
		
		assertEquals("fulano",aluno.getNome());
		assertEquals(123,aluno.getCpf());
	}
	
	@Test
	public void TesteListandoAluno() throws SQLException {
		AlunoDao alunodao = new AlunoDao();
		assertEquals("Listando com sucesso!",2,alunodao.listar().size());
		
	}

}
