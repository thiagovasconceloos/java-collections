package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaBuscaAlunonoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando coleções do java",
                "Thiago Vasconcelos");



		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Thiago Vasconcelos", 2020);
		Aluno a2 = new Aluno("Alexandre Vasconcelos", 2021);
		Aluno a3 = new Aluno("Leonardo Vasconcelos", 2022);
		Aluno a4 = new Aluno("Maria Vasconcelos", 2022);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
	
	    
 		System.out.println("Quem é o aluno da matricula 2020");
		Aluno aluno = javaColecoes.buscaMatriculado(2022);
		System.out.println(aluno);

	}

}
