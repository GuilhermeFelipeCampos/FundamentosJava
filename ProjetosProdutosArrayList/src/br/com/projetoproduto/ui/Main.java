package br.com.projetoproduto.ui;
import java.util.ArrayList;

import br.com.projetoprodutos.model.Produto;

public class Main {

	public static void main(String[] args) {
		
		
		double total = 0;
		Produto maior,menor;
		
		ArrayList<Produto> listaProduto;
		
		listaProduto = new ArrayList<Produto>();
		
		listaProduto.add(new Produto(1,"Cama",500.0,3));
		listaProduto.add(new Produto(2,"Toalha",150.0,10));
		listaProduto.add(new Produto(3,"Lençol",200.0,6));
		listaProduto.add(new Produto(4,"Camisa",50.0,20));
		listaProduto.add(new Produto(5,"Calça",150.0,8));
		listaProduto.add(new Produto(6,"Sapato",350.0,15));
		
		
		maior = listaProduto.get(0);
		menor = listaProduto.get(0);

		for(Produto produto : listaProduto) {
			
			if(maior.getPreco() < produto.getPreco()) {		
				maior = produto;
			}
			if(menor.getPreco() > produto.getPreco()) {
				menor = produto;
			}
		
			total += produto.getPreco() * produto.getQtdestoque();
			
		}
		
		System.out.println("Produto de maior valor :"+maior);
		System.out.println("");
		System.out.println("Produto de menor valor :"+menor);
		System.out.println("");
		System.out.println("Total em Estoque :R$" +total);
		
	}

}
