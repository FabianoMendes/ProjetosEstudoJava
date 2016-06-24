package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class TestaMap {

	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		nomesParaIdade.keySet().forEach(matricula-> {
			System.out.println(nomesParaIdade.get(matricula));
		});
	}

}
