package br.com.postocombustivel.inteface;
import br.com.postocombustivel.model.Combustivel;

import java.util.Scanner;



public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Combustivel bomba[] = new Combustivel[3];
		
		bomba[0] = new Combustivel("Gasolina",6.50);
		bomba[1] = new Combustivel("Alcool",5.50);
		bomba[2] = new Combustivel("Diesel",3);
		bomba[3] = new Combustivel("Gás",2.5);
		
		
	}
}
