import java.util.Scanner;

public class caixa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta user = new Conta();
		
		System.out.println("Insira o número da conta:");
		user.numeroConta = sc.nextInt();
		System.out.println("Insira o nome do títular:");
		user.nome = sc.nextLine();
		System.out.println("Insira o CPF do titular:");
		user.cpf = sc.nextLine();
		System.out.println("Escolha o tipo de conta");
		user.tipo = sc.nextInt();
		
		
		
		
		

	}

}
