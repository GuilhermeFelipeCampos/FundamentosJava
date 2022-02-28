package br.com.pibank.ui;

import java.util.Scanner;

import br.com.pibank.model.Conta;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		int opcao, escolha;
		
		Conta corrente = new Conta("Guilherme","987654321",6543214,150.50);
		
		System.out.println("Digite 1 - Conta Corrente\nDigite 2 - Conta Especial");
		opcao = sc.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("Digite 1 - Debitar\nDigite 2 - Creditar");
			escolha = sc.nextInt();
			if(escolha == 1) {
				
				
			}
		case 2:
		default:
			break;
		}
		

	}

}
