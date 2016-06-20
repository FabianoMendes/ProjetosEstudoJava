package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.sistema.AtualizadorDeContas;

public class Principal {
	public static void main(String[] args) {
		//ContaCorrente conta = new ContaCorrente();
		//conta.deposita(100.0);

		//System.out.println(conta.getSaldo());
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.deposita(1000);
		cp.deposita(1000);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		AtualizadorDeContas atu = new AtualizadorDeContas(0.01);
		atu.roda(cc);
		atu.roda(cp);
		
		System.out.printf("O saldo é: %.2f\n", atu.getSaldoTotal());
	}
}
