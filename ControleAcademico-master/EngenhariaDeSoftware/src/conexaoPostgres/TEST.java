package conexaoPostgres;

import java.sql.SQLException;

import Dao.AlunoDao;

public class TEST {

	public static void main(String[] args) throws SQLException {
		AlunoDao aluno = new AlunoDao();
		System.out.println(aluno.buscar(10));
		
		
	}

}
