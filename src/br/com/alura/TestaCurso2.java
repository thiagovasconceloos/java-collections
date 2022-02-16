package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando coleções do java",
		                                "Thiago Vasconcelos");
		
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma aula",20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções",22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		aulasImutaveis.forEach(aula -> System.out.println(aula));
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		
		Collections.sort(aulas);
		
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		
	}

}
