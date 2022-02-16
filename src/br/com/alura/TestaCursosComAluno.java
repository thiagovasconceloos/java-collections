package br.com.alura;

import java.util.List;

public class TestaCursosComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando coleções do java",
                "Thiago Vasconcelos");


				//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));

				javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
				javaColecoes.adiciona(new Aula("Criando uma aula",20));
				javaColecoes.adiciona(new Aula("Modelando com Coleções",22));
				
				Aluno a1 = new Aluno("Thiago Vasconcelos",2020);
				Aluno a2 = new Aluno("Alexandre Vasconcelos",2021);
				Aluno a3 = new Aluno("Leonardo Vasconcelos",2022);
				
				
				javaColecoes.matricula(a1);
				javaColecoes.matricula(a2);
				javaColecoes.matricula(a3);
				
				
				javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		
	}

}
