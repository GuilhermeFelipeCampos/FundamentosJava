package br.com.model;

public class Pessoa {
    protected int numeroCadastral;
	protected String nome;
	protected String endereco;
	
	
	public Pessoa(int numeroCadastral, String nome, String endereco) {
		super();
		this.numeroCadastral = numeroCadastral;
		this.nome = nome;
		this.endereco = endereco;
	}


	public int getNumeroCadastral() {
		return numeroCadastral;
	}


	public void setNumeroCadastral(int numeroCadastral) {
		this.numeroCadastral = numeroCadastral;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double calculaImposto() {
		double imposto = 0;
		
		return imposto;
	}


	@Override
	public String toString() {
		return "Pessoa [numeroCadastral=" + numeroCadastral + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
	
	
	
	
}
