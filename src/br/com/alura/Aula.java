package br.com.alura;

public class Aula  implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo){
		this.titulo = titulo;
		this.tempo = tempo;
		
	}

	public String getTitulo() {
		return titulo;
	}


	public int getTempo() {
		return tempo;
	}
	
   //reescrevendo  o metodo toString
	@Override
	public String toString() {
		return "Titulo da Aula: " + titulo + ", Tempo estimado: " + tempo + "";
	}

	@Override
	public int compareTo(Aula a1) {
		
		return this.titulo.compareTo(a1.titulo);
	}

	
	
	
	
	
	

}
