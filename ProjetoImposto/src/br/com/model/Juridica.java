package br.com.model;

public class Juridica extends Pessoa{
	
	private String cnpj;
	private double faturamento;
	
	
	
	
	public Juridica(int numeroCadastral, String nome, String endereco, String cnpj, double faturamento) {
		super(numeroCadastral, nome, endereco);
		this.cnpj = cnpj;
		this.faturamento = faturamento;
	}




	public String getCnpj() {
		return cnpj;
	}




	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}




	public double getFaturamento() {
		return faturamento;
	}




	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
	
	@Override
	public double calculaImposto() {
		
		double baseCalculo = this.faturamento;
		double imposto;
		if(baseCalculo < 100000) {
			
			imposto = 0;
			
		}else if(baseCalculo >= 100000 && baseCalculo < 250000){
			
			imposto = baseCalculo * 0.06;
			
		}else if (baseCalculo >=250000 && baseCalculo < 450000) {
			imposto = baseCalculo * 0.15;
		}else {
			imposto = baseCalculo * 0.25;
		}
	
		return imposto;
		
	}




	@Override
	public String toString() {
		return "Juridica [numeroCadastral= " + numeroCadastral + ", nome= " + nome + ", endereco= " + endereco + ", cnpj= "
				+ cnpj + ", faturamento= R$" + String.format("%.2f", faturamento) + "]"+" Imposto a pagar R$ " +String.format("%.2f",calculaImposto());
	}
	
	
	
	
	
	
	

}
