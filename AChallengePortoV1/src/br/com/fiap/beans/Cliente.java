package br.com.fiap.beans;

public class Cliente {
	// variáveis
	private String nome;
	private int idade;
	private String sexo;
	private String estadoCivil;
	private String nacionalidade;
	// vazio
	public Cliente() {
		super();
	}
	// cheio
	public Cliente(String nome, int idade, String sexo, String estadoCivil, String nacionalidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.nacionalidade = nacionalidade;
	}
	// setters and getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	

}
