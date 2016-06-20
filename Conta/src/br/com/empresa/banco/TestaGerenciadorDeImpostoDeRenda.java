package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.SeguroDeVida;
import br.com.empresa.sistema.GerenciadorDeImpostoDeRenda;

public class TestaGerenciadorDeImpostoDeRenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000.0);
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());

	}

}
