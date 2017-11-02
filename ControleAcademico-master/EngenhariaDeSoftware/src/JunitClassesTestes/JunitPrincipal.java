package JunitClassesTestes;

import org.junit.Assert;
import org.junit.Test;

import Dao.PrincipalDao;
//import junit.framework.Assert;

public class JunitPrincipal {

	@Test
	public void testLoginAdmin() {
		PrincipalDao pd = new PrincipalDao();
		boolean result = pd.buscarLoginAdmin(1, "admin");
		
		Assert.assertTrue("Login Administrador efetuado com sucesso!", result);
	}
	
	@Test
	public void testLoginAluno() {
		PrincipalDao pd = new PrincipalDao();
		boolean a = pd.buscarLoginAluno(1, "easy");
		Assert.assertTrue("Login aluno efetuado com sucesso!", a);
		boolean b = pd.buscarLoginAluno(2, "s");
		Assert.assertTrue("Login aluno efetuado com sucesso!", b);
		boolean c = pd.buscarLoginAluno(3, "gato");
		Assert.assertTrue("Login aluno efetuado com sucesso!", c);
	}

}
