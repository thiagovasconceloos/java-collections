package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListadeAula {

	public static void main(String[] args) {
		//Criamos três objetos do tipo aula
        Aula a1 = new Aula("Revistando os ArrayLists",21);
        Aula a2 = new Aula("Lista de Objetos",20);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos",15);
        //Criamos uma arraylist e adicionamos a referencia dos objetos nela
        ArrayList<Aula> aulas = new ArrayList<>();
        
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        //foreach para visualizar todas as aulas no array list
        aulas.forEach(aula-> System.out.println(aula));
        //estamos ordenando em ordem alfabetica com base no titulo
        Collections.sort(aulas);
        
        //foreach para visualizar todas as aulas no array list ordenado
        aulas.forEach(aula-> System.out.println(aula));
        
        
        //ordenando com base no criterio de tempo (função anonima)
        Collections.sort(aulas,Comparator.comparing(Aula::getTempo));
		
        //foreach para visualizar todas as aulas no array list ordenado
        aulas.forEach(aula-> System.out.println(aula));
        //usando o proprio metodo de ordenação do arraylist 
        //e dando como parametro a funcao que ordena pelo tempo
        aulas.sort(Comparator.comparing(Aula::getTempo));
        
        //foreach para visualizar todas as aulas no array list ordenado
        aulas.forEach(aula-> System.out.println(aula));
		
	}

}
