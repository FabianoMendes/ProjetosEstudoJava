package br.com.empresa.banco.conta;

import br.com.empresa.sistema.Tributavel;

public class SeguroDeVida implements Tributavel{

	@Override
	public double calculaTributos() {
		return 42;
	}

}
