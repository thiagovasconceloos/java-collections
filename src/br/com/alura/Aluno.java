package br.com.alura;

public class Aluno {
	
	private String nome;
	private int id;
	
	public Aluno(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Nome do aluno: " + nome + ", matricula: " + id + "";
	}
	
	
	
	

}
