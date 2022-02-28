package br.com.sodamachine.machine;

import java.util.Scanner;

import br.com.sodamachine.refrigerantes.Refrigerantes;

public class Maquina {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Refrigerantes soda[] = new Refrigerantes[5];
		
		soda[0] = new Refrigerantes("Coca-cola",2.0,6);
		soda[1] = new Refrigerantes("Fanta",1.5,3);
		soda[2] = new Refrigerantes("Sprite",1.75,2);
		soda[3] = new Refrigerantes("Guarana",3.5,5);
		soda[4] = new Refrigerantes("tonica",3.0,1);
		
		double dinheiro;
		int op;
		
		System.out.println("Escolha o refrigerante desejado:");
		op = sc.nextInt();
		System.out.println("Insira o dinheiro:");
		dinheiro = sc.nextDouble();
		
		switch(op){
		case 0:
		break;
		
		case 1:
		break;
			
		case 2:
		break;
		
		case 3:
		break;
		
		case 4:
		break;
		
		default:
		break;
		
		}
		
		
		
	}
}
