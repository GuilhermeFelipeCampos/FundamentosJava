package br.com.tributaimposto.model.veiculos;

import br.com.tributoimposto.services.BemTributo;

public class Carro extends Veiculo implements BemTributo{

	private int numeroPortas;
	private double potencia;
	
	
	
	public Carro(String marca, String modelo, int ano, double preco, int numeroPortas, double potencia) {
		super(marca, modelo, ano, preco);
		this.numeroPortas = numeroPortas;
		this.potencia = potencia;
	}



	public int getNumeroPortas() {
		return numeroPortas;
	}



	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}



	public double getPotencia() {
		return potencia;
	}



	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	

	@Override
	public double calculaImposto() {
		double imposto;
		if(super.ano <2000.0) {
			
			imposto  = 0;
			
		}else {
			imposto = (super.preco *0.04);
		}
		return imposto;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + ", numeroPortas="
				+ numeroPortas + ", potencia=" + potencia + "]" + "Valor do Imposto : R$"+ String.format("%.2f", calculaImposto());
	}


	
	
}
