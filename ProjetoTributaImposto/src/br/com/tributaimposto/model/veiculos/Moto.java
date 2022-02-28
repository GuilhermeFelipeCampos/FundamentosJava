package br.com.tributaimposto.model.veiculos;

import br.com.tributoimposto.services.BemTributo;

public class Moto extends Veiculo implements BemTributo{
	
	

	private int cilindradas;
	private String tipo;
	
	
	
	public Moto(String marca, String modelo, int ano, double preco, int cilindradas, String tipo) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
		this.tipo = tipo;
	}
	
	
	public int getCilindradas() {
		return cilindradas;
	}



	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public double calculaImposto() {
		double imposto;
		
		if(this.cilindradas < 500) {
			
			imposto = (super.preco * 0.025);
		}else {
			
			imposto = (super.preco * 0.05);
			
		}
		return imposto ;
	}


	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + ", cilindradas="
				+ cilindradas + ", tipo=" + tipo + "]"+ "Valor do Imposto : R$"+ String.format("%.2f", calculaImposto());
	}



	
	

}
