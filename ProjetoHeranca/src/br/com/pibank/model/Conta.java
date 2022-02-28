package br.com.pibank.model;

public class Conta {
	
	
	protected String nome;
	protected String cpf;
	protected int numConta;
	protected double saldo;
	
	
	public Conta() {
		
	}
	
	
	public Conta(String nome, String cpf, int numConta, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean debitar(double valor) {
		
		if(valor > this.saldo) {
			
			return false;
		}
		this.saldo -= valor;
		
		return true;
		
	}
	
	public void creditar (double valor) {
		
		this.saldo += valor;
	}
	
	public String exibirInfo() {
		
	String	mensagem = "Titular da conta: "+this.nome+"\nCPF: "+this.cpf+
					   "\nNúmero da Conta: "+this.numConta+"\nSaldo R$"+String.format("\0.2f", saldo);
		
		return mensagem;
	}

	

}
