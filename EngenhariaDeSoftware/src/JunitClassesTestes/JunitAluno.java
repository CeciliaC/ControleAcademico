package JunitClassesTestes;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Aluno;

public class JunitAluno {
	@Test
	public void TestandoAluno() {
		Aluno aluno = new Aluno();
		aluno.setNome("fulano");
		assertEquals("fulano",aluno.getNome());
	}
}
