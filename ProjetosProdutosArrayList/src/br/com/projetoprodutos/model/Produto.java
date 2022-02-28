package br.com.projetoprodutos.model;

public class Produto {
	
	private int id;
	private String descricao;
	private double preco;
	private int qtdestoque;
	
	
	public Produto(int id, String descricao, double preco, int qtdestoque) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.qtdestoque = qtdestoque;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQtdestoque() {
		return qtdestoque;
	}


	public void setQtdestoque(int qtdestoque) {
		this.qtdestoque = qtdestoque;
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + ", qtdestoque=" + qtdestoque
				+ "]";
	}
	
	
	

}
