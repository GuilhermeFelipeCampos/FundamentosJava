
public class Conta {

	int numeroConta;
	String nome;
	String cpf;
	int tipo;
	double saldo;
	
	void depositar(double valor) {
		
		saldo += valor;
		System.out.printf("Foi depositado em sua conta R$ %.2f e seu saldo atual é de %.2f\n", valor,saldo);
		
	}
	
	boolean saque(double valor) {
		if(saldo > valor) {
			
			saldo-= valor;
			
			return true;
		}
		
		return false;
		
	}
	
	void exibirDadosConta() {
		System.out.println("Numero da Conta: "+numeroConta);
		System.out.println("Titular da conta: "+nome);
		System.out.println("CPF do Titular: "+cpf);
		String conta;
		if(tipo == 0) {
			conta = "Corrente";
		}else if(tipo == 1) {
			conta = "Poupança";
		}else {
			conta = "Investimento";
		}
		System.out.println("Tipo da conta :"+conta);
		System.out.printf("Saldo da conta "+conta+": R$ %.2f\n",saldo);
	}
}
