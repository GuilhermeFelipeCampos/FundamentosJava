package br.com.folhapagamento.model;

public class Chefe extends Funcionario{

	private double salarioBase;
	private double adicionaFuncao;
	private double beneficioTerno;
	
	
	public Chefe(String nome, int numeroRegistro, double salarioBase, double adicionaFuncao, double beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionaFuncao = adicionaFuncao;
		this.beneficioTerno = beneficioTerno;
		
		
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public double getAdicionaFuncao() {
		return adicionaFuncao;
	}


	public void setAdicionaFuncao(double adicionaFuncao) {
		this.adicionaFuncao = adicionaFuncao;
	}


	public double getBeneficioTerno() {
		return beneficioTerno;
	}


	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	@Override
	public double calculaSalario() {
		
		double salarioFinal;
		salarioFinal = this.salarioBase + (this.salarioBase * this.adicionaFuncao / 100)+ this.beneficioTerno;
		
		return salarioFinal;
	}


	@Override
	public String toString() {
		return "Chefe [nome=" + nome + ", numeroRegistro=" + numeroRegistro + ", salarioBase=" + salarioBase
				+ ", adicionaFuncao=" + adicionaFuncao + ", beneficioTerno=" + beneficioTerno + "]";
	}
	
	
	
	
}
