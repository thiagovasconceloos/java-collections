package br.com.alura;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class TestaCursosComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando coleções do java",
                "Thiago Vasconcelos");



		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Thiago Vasconcelos", 2020);
		Aluno a2 = new Aluno("Alexandre Vasconcelos", 2021);
		Aluno a3 = new Aluno("Leonardo Vasconcelos", 2022);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");

		Set<Aluno> alunos = javaColecoes.getAlunos();

		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}

		Vector<Aluno> vetor = new Vector<>();

		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno vasconcelos = new Aluno("Leonardo Vasconcelos", 2026);
		System.out.println("E esse Vasconcelos, esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(vasconcelos));

		System.out.println("O a1 é  equals ao Vasconcelos?");
		System.out.println(a1.equals(vasconcelos));

		

		System.out.println(a3.hashCode() == vasconcelos.hashCode());

	}
		       
		       
		       
	}


