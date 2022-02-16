package br.com.alura;

import java.util.*;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de lista";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);	
		aulas.add(aula3);	
		
		//usando foreach  e lambda para mostrar na tela
		aulas.forEach((aula)-> System.out.println(aula));
		//removendo um item da lista
		aulas.remove(0);
		
		//usando foreach  e lambda para mostrar na tela
		aulas.forEach(aula-> System.out.println(aula));
		//usamos o collections para realizar uma ordenação na lista quando não temos um comparetor
		Collections.sort(aulas);
		
		//usando foreach  e lambda para mostrar na tela
		aulas.forEach(aula-> System.out.println(aula));
		
		 
	}

}
