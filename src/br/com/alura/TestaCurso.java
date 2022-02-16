package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando coleções do java",
		                                "Thiago Vasconcelos");
		
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma aula",20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções",22));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		aulas.forEach(aula -> System.out.println(aula));
		
		
		
	}

}
