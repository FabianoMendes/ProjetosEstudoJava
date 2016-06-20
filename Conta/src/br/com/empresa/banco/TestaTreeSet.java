package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TestaTreeSet {

	public static void main(String[] args) {
		List<Integer> contas = new ArrayList<>();
		
		for(int i = 0; i <= 1000; i++){
			contas.add(i);
		}
		
		Collections.reverse(contas);
		
		for (Integer integer : contas) {
			System.out.println(integer);
		}
	}

}
