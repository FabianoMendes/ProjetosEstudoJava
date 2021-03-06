package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		ArrayList<String> cursos = new ArrayList<>();
		
		String aula1 = "Java";
		String aula2 = "Android";
		String aula3 = "Oracle";
		
		cursos.add(aula1);
		cursos.add(aula2);
		cursos.add(aula3);
		
		for (String curso : cursos) {
			System.out.println(curso);
		}
		
		//cursos.remove(aula2);
		
		Collections.sort(cursos);
		
		System.out.println("O primeiro curso da lista eh o: " + cursos.get(0)); // como acessar o primeiro valor?
		
		for (String curso : cursos) {
			System.out.println(curso);
		}
	}
	
}
