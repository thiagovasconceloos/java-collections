package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	
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

}
