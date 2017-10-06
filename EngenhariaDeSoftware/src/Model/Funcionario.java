package Model;

import java.sql.Date;

public class Funcionario {
	int id;
	String nome;
	String endereco;
	String cpf;
	Date dta_nascimento;
	Date dta_ingresso;
	String curso;
	String periodo;
	int matricula;
	
	public Funcionario(int id, String nome, String endereco, String cpf, Date dta_nascimento, Date dta_ingresso, String curso,
			String periodo, int matricula) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dta_nascimento = dta_nascimento;
		this.dta_ingresso = dta_ingresso;
		this.curso = curso;
		this.periodo = periodo;
		this.matricula = matricula;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
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
	
	
}
