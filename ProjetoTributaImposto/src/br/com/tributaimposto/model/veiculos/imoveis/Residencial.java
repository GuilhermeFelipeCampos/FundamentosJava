package br.com.tributaimposto.model.veiculos.imoveis;

import br.com.tributoimposto.services.BemTributo;

public class Residencial extends Imovel implements BemTributo{
	
	private double metragem;

	public Residencial(String endereco, double valorVenal, double metragem) {
		super(endereco, valorVenal);
		this.metragem = metragem;
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}

	@Override
	public double calculaImposto() {
		double imposto;
		if(this.metragem <= 100.0) {
			
			imposto = (super.valorVenal * 0.015);
		}else {
			
			imposto = (super.valorVenal * 0.03);
		}
		
		return imposto;
	}

	@Override
	public String toString() {
		return "Residencial [endereco=" + endereco + ", valorVenal=" + valorVenal + ", metragem=" + metragem + "]"+
				"Valor do Imposto : R$"+ String.format("%.2f", calculaImposto());
	}
	
	
	

}
