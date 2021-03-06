package br.com.empresa.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao{

	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<>();
		Random random = new Random();
		
		ContaPoupanca conta1 = new ContaPoupanca();
		conta1.setNumero(3);
		conta1.setNome("Fabiano");
		conta1.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(conta1);
		
		ContaPoupanca conta2 = new ContaPoupanca();
		conta2.setNumero(2);
		conta2.setNome("Bruno");
		conta2.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(conta2);
		
		ContaPoupanca conta3 = new ContaPoupanca();
		conta3.setNumero(9);
		conta3.setNome("Arthur");
		conta3.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(conta3);
		
		ContaPoupanca conta4 = new ContaPoupanca();
		conta4.setNumero(1);
		conta4.setNome("Gabriel");
		conta4.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(conta4);
		
		Collections.sort(contas);
		
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}

	}

}
