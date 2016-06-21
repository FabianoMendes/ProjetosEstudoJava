package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Java", 30);
		Aula a2 = new Aula("Android", 20);
		Aula a3 = new Aula("Oracle", 25);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		Collections.sort(aulas);
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);

	}

}