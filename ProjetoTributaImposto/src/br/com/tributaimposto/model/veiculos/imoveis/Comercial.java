package br.com.tributaimposto.model.veiculos.imoveis;

import br.com.tributoimposto.services.BemTributo;

public class Comercial extends Imovel implements BemTributo{
	
	private String uso;

	public Comercial(String endereco, double valorVenal, String uso) {
		super(endereco, valorVenal);
		this.uso = uso;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	@Override
	public double calculaImposto() {
		
		return super.valorVenal * 0.04;
	}

	@Override
	public String toString() {
		return "Comercial [endereco=" + endereco + ", valorVenal=" + valorVenal + ", uso=" + uso + "]"+
				"Valor do Imposto : R$"+ String.format("%.2f", calculaImposto());
	}
	
	
}
