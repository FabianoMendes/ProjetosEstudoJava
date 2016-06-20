package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaComparaConta {

	public static void main(String[] args) {
		Conta conta1 = new ContaPoupanca();
		conta1.setNumero(123);
		conta1.setNome("Fabiano");
		
		Conta conta2 = new ContaPoupanca();
		conta2.setNumero(123);
		conta2.setNome("Bruno");
		
		
		if(conta1 == conta2){
			System.out.println("Contas iguais");
		}else {
			System.out.println("Contas diferentes");
		}
		
		if(conta1.equals(conta2)){
			System.out.println("Contas iguais");
		}else {
			System.out.println("Contas diferentes");
		}
	}

}