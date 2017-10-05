package conexaoPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String driver;
	private String url;
	private String usuario;
	private String senha;
	private Connection con;

	public Conexao() {
		driver = "org.postgresql.Driver";
		url = "jdbc:postgresql://localhost:5432/postgres";
		usuario = "postgres";
		senha = "root";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão OK!");

		} catch (Exception ex) {
			System.out.println("Problemas no Driver de Conexão");
		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}