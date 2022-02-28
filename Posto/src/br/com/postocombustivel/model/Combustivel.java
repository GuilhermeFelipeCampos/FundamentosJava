package br.com.postocombustivel.model;

public class Combustivel {
	
	private String nome;
	private double valor;
	private double litros;
	private double total;
	
	
	
	
	public Combustivel(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void abastercerPorLitros(double qtd) {
		
		this.litros = qtd;
		this.total = this.litros * this.valor;
	}
	
	public void abastecerPorValor(double valorAbastecido) {
		
		this.total = valorAbastecido;
		this.litros = this.total / this.valor;
	}
	
	
	public String exibirRecibo() {
		
		String mensagem;
		
		mensagem = "0";
		
		return mensagem;
	}
	
	
	
}
	
