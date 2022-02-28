package br.com.folhapagamento.model;

public class Empreiteiro extends Funcionario{
	
	private double valorEmpreitada;

	public Empreiteiro(String nome, int numeroRegistro, double valorEmpreitada) {
		super(nome, numeroRegistro);
		this.valorEmpreitada = valorEmpreitada;
	}

	public double getValorEmpreitada() {
		return valorEmpreitada;
	}

	public void setValorEmpreitada(double valorEmpreitada) {
		this.valorEmpreitada = valorEmpreitada;
	}
	@Override
	public double calculaSalario() {
		
	
	return this.valorEmpreitada;
	}

	@Override
	public String toString() {
		return "Empreiteiro [nome=" + nome + ", numeroRegistro=" + numeroRegistro + ", valorEmpreitada="
				+ valorEmpreitada + "]";
	}
	
	
	
}
