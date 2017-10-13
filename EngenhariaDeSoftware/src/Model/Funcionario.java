package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
	int id;
	String nome;
	String endereco;
	int cpf;
	Date dta_nascimento;
	Date dta_ingresso;
	String curso;
	String periodo;
	int matricula;
	int telefone;
	String email;
	String nivelEscolaridade;
	String senha;
	
	public Funcionario(String nome, String endereco, int cpf, String dta_nascimento, String dta_ingresso,
			String curso, String periodo, int matricula, int telefone, String email, String nivelEscolaridade,
			String senha) {
		super();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		try {
			this.dta_nascimento = formato.parse(dta_nascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			this.dta_ingresso = formato.parse(dta_ingresso);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.curso = curso;
		this.periodo = periodo;
		this.matricula = matricula;
		this.telefone = telefone;
		this.email = email;
		this.nivelEscolaridade = nivelEscolaridade;
		this.senha = senha;
	}
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Date getDta_nascimento() {
		return dta_nascimento;
	}
	public void setDta_nascimento(Date dta_nascimento) {
		this.dta_nascimento = dta_nascimento;
	}
	public Date getDta_ingresso() {
		return dta_ingresso;
	}
	public void setDta_ingresso(Date dta_ingresso) {
		this.dta_ingresso = dta_ingresso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNivelEscolaridade() {
		return nivelEscolaridade;
	}
	public void setNivelEscolaridade(String nivelEscolaridade) {
		this.nivelEscolaridade = nivelEscolaridade;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf
				+ ", dta_nascimento=" + dta_nascimento + ", dta_ingresso=" + dta_ingresso + ", curso=" + curso
				+ ", periodo=" + periodo + ", matricula=" + matricula + ", telefone=" + telefone + ", email=" + email
				+ ", nivelEscolaridade=" + nivelEscolaridade + "]";
	}
	
	
}
	