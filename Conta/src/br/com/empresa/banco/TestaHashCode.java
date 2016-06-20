package br.com.empresa.banco;

import java.util.HashSet;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaHashCode {

	public static void main(String[] args) {
		HashSet<Conta> contas = new HashSet<Conta>();
		
		Conta c1 = new ContaCorrente();
		c1.setNumero(123);
		contas.add(c1);
		
		Conta c2 = new ContaCorrente();
		c2.setNumero(123);
		contas.add(c2);
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
			

	}

}
