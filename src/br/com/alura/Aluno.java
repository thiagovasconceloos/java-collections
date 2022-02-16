package br.com.alura;

public class Aluno {
	
	private String nome;
	private int id;
	
	public Aluno(String nome, int id) {
		if(nome == null) {
			
			 throw new NullPointerException("Nome não pode ser nulo");
			 
		}
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
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome);
	}

	@Override
	public int hashCode() {
		
		return this.nome.charAt(0);
	}
	
	
	@Override
	public String toString() {
		return "Nome do aluno: " + nome + ", matricula: " + id + "";
	}
	
	
	
	

}
