package br.com.pibank.model;

public class ContaEspecial extends Conta{
	
	private double limite;
	

	public ContaEspecial(String nome, String cpf, int numConta, double saldo, double limite) {
		super(nome, cpf, numConta, saldo);
		
		this.limite = limite;
		
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public boolean debitar(double valor) {
		
		if(valor > super.saldo && valor > this.limite) {
			return false;
		}
		valor -= super.saldo; 
		this.limite -= valor;
		return true;
	}
	
	@Override
	public String exibirInfo() {
		
		String	mensagem = "Titular da conta Especial: "+this.nome+"\nCPF: "+this.cpf+
				   "\nNúmero da Conta: "+this.numConta+"\nSaldo R$"+String.format("\0.2f", super.saldo)+
				   "\nLimite R$"+String.format("\0.2f", this.limite) ;
	
	return mensagem;
		
	}

}
