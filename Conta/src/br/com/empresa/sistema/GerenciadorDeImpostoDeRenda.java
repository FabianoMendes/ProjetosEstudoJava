package br.com.empresa.sistema;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adicionado Tributavel: " + t);
		this.total += t.calculaTributos();
	}

	public double getTotal() {
		return this.total;
	}
	
}
