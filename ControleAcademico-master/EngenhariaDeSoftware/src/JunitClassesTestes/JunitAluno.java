package JunitClassesTestes;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import Dao.AlunoDao;
import Model.Aluno;
//import javafx.scene.chart.PieChart.Data;

public class JunitAluno {
	@Test
	public void TestandoAluno() throws ParseException {
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
		
		assertEquals("fulano",aluno.getNome());
		assertEquals("Rua tal",aluno.getEndereco());
		assertEquals(123,aluno.getCpf());
		assertEquals(df.parse("10/10/2010"),aluno.getDta_nascimento());
		assertEquals(df.parse("10/10/1910"),aluno.getDta_ingresso());
		assertEquals("ciencia computacao",aluno.getCurso());
		assertEquals("informatica",aluno.getdepartamento());
		assertEquals(121990,aluno.getMatricula());
		assertEquals("123",aluno.getSenha());
		assertEquals("default",aluno.getNivelEscolaridade());
		assertEquals(123,aluno.getTelefone());
	}
	
	

}
