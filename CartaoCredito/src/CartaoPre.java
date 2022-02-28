import java.text.DecimalFormat; 
public class CartaoPre {

	private String numeroCartao;
	private String nomeTitular;
	private int anoValidade;
	private int mesValidade;
	private double saldo;
	
	
	public CartaoPre(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}


	public String getNumeroCartao() {
		return numeroCartao;
	}


	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public int getAnoValidade() {
		return anoValidade;
	}


	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}


	public int getMesValidade() {
		return mesValidade;
	}


	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}


	public double getSaldo() {

		return saldo;
	}


	public void setSaldo(double saldo) {
		
		this.saldo = saldo;
	}
	
	public double adicionarCredito(double valor) {
		
		this.saldo += valor;
		
		return valor;
	}
	
	public boolean comprar(double valor) {
		
		
		if(valor > saldo) {
			
			return false ;
		}else {
			this.saldo -= valor;
			return true;
		}
		
	}
	
	
}
