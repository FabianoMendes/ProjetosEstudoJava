package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Java", "Fabiano");
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Java 1", 15));
		javaColecoes.adiciona(new Aula("Java 2", 19));
		javaColecoes.adiciona(new Aula("Java 3", 12));
		
		System.out.println(javaColecoes.getAulas());
	}

}