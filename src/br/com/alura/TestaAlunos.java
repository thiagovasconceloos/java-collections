package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Thiago");
		alunos.add("Leonardo");
		alunos.add("Alexandre");
		
		boolean verifica = alunos.contains("Thiago");
		System.out.println(verifica);
		
		
		System.out.println(alunos);
		
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
	    List<String> alunoslista = new ArrayList<>(alunos);
	    
	    System.out.println(alunoslista.get(2));
	    
		
	}

}
