package JunitClassesTestes;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import Dao.FuncionarioDao;
import Model.Funcionario;

public class JunitFuncionario {

	@Test
	public void TesteRemoverFuncionario() throws SQLException {
		FuncionarioDao funcionariodao = new FuncionarioDao();
		Funcionario f = new Funcionario();
		//CONFERIR ID NO BANCO DE DADOS!!!
		f.setId(1);
		boolean result = funcionariodao.remove(f);
		//Assert.assertEquals("Teste Remover foi um sucesso",true,alunodao.remove(aluno));
		Assert.assertTrue("Teste Remover executado com sucesso", result);
	}
}
