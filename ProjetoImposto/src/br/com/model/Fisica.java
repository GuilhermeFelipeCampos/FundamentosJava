package br.com.model;

public class Fisica extends Pessoa{
	
	
	private String cpf;
	private double rendimentoAnual;
	private int dependentes;
	
	
	public Fisica(int numeroCadastral, String nome, String endereco, String cpf, double rendimentoAnual,
			int dependentes) {
		super(numeroCadastral, nome, endereco);
		this.cpf = cpf;
		this.rendimentoAnual = rendimentoAnual;
		this.dependentes = dependentes;
	}
	
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	
	@Override
	public double calculaImposto() {
		
		double baseCalculo, imposto;	
		if(this.dependentes >= 1) {
			baseCalculo = this.rendimentoAnual - (1770 * this.dependentes);
		}else {
			baseCalculo = this.rendimentoAnual;
		}
		
		if(baseCalculo < 25000) {
			
			imposto = 0;
		}else if(baseCalculo >= 25000 && baseCalculo < 50000){
			
			imposto = baseCalculo * 0.15;
		}else if (baseCalculo >=50000 && baseCalculo < 100000) {
			imposto = baseCalculo * 0.20;
		}else {
			imposto = baseCalculo * 0.27;
		}
	
		return imposto;
		
	}


	@Override
	public String toString() {
		return "Fisica [numeroCadastral=" + numeroCadastral + ", nome=" + nome + ", endereco=" + endereco + ", cpf="
				+ cpf + ", rendimentoAnual=" + String.format("%.2f", rendimentoAnual )+ ", dependentes=" + dependentes + "]" + "Imposto a Pagar: R$"+
				String.format("%.2f", calculaImposto());
	}
	
	
	
	

}
