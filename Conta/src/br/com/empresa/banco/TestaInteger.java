package br.com.empresa.banco;

import java.io.PrintStream;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaInteger {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		String teste = new String("123");
		Integer x = new Integer(0);
		
		x = Integer.parseInt(teste);
		System.out.println(x);
		
		
		PrintStream saida = System.out;
	    saida.println("ola");
	    
	    Conta conta = new ContaCorrente();
	    System.out.println(conta);
	}

}
