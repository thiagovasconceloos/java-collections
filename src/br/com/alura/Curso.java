package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	
	public Curso(String nome, String instrutor) {
	
		this.nome = nome;
		this.instrutor = instrutor;
		
	}
	//collections.unmodifiablelist apenas permite a leitura e nao edi��o.
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		
	}
	
	public int getTempoTotal() {
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		
	}

	@Override
	public String toString() {
		return "Curso: " + nome + ", instrutor: " + instrutor + ", tempo total do curso:  "+ this.getTempoTotal();
	}
	
	public void matricula(Aluno aluno) {
		
		this.alunos.add(aluno);
		
	}
	
		
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	

}
