package br.com.tributaimposto.model.veiculos.imoveis;

import br.com.tributoimposto.services.BemTributo;

public class Rural extends Imovel implements BemTributo{

	private String tipo;

	public Rural(String endereco, double valorVenal, String tipo) {
		super(endereco, valorVenal);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public double calculaImposto() {
		
		return 0;
	}

	@Override
	public String toString() {
		return "Rural [endereco=" + endereco + ", valorVenal=" + valorVenal + ", tipo=" + tipo + "]";
	}
	
	
	
	

}
