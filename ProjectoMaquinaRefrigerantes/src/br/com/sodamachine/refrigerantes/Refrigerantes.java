package br.com.sodamachine.refrigerantes;

public class Refrigerantes {
	
	private String nome;
	private double preco;
	private int qtd;
	
	
	
	public Refrigerantes() {
		
	}
	
	public Refrigerantes(String nome, double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
	
	
	public double compra (double valor) {
		double troco;
		troco = valor - this.preco;
		setQtd(getQtd() - 1);
		return troco;
	}
	
	
	
}
