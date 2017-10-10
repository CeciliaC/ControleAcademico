package conexaoPostgres;

import java.sql.SQLException;

public class TEST {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory con = new ConnectionFactory();
		con.getConexao();
	}

}
