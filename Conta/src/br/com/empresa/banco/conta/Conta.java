package br.com.empresa.banco.conta;

public abstract class Conta implements Comparable<Conta>{

	private int agencia;
	private int numero;
	private String nome;
	protected double saldo;

	public Conta() {

	}

	public Conta(int agencia, int numero, String nome, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}

	}

	public void saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo Insuficiente");
		} else {
			this.saldo -= valor;
		}
	}

	public abstract void atualiza(double taxa);

	@Override
	public String toString() {
		return "Numero da conta: " + this.getNumero();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)	
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
        return this.getNome().compareTo(outra.getNome());
    }

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
