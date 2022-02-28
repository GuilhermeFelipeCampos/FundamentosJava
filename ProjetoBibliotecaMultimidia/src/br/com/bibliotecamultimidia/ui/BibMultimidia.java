package br.com.bibliotecamultimidia.ui;

import java.util.HashMap;
import java.util.Scanner;

import br.com.bibliotecamultimidia.model.BibCD;
import br.com.bibliotecamultimidia.model.BibDVD;

public class BibMultimidia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String titulo,artista, comentario, possui;
		int numeroMusicas, tempoTotal, opcao, cd= 0, dvd = 0;
		boolean copia;
		
		
		HashMap<Integer,BibCD> mapaCd = new HashMap<Integer,BibCD>();
		HashMap<Integer,BibDVD> mapaDvd = new HashMap<Integer,BibDVD>();
		
		
		
		
		mapaCd.put(1, new BibCD("Não Sei o Nome","João Fábio",12,120,false,"Músicas para encher o saco"));
		mapaCd.put(2, new BibCD("Não Sei Falar","Maria Lima",10,160,false,"Músicas para Relaxar"));
		mapaCd.put(3, new BibCD("Vai Dormir","Zé das Coves",10,132,true,"Músicas para Relaxar"));
		mapaCd.put(4, new BibCD("Acordar Legal","Zé das Coves",6,120,false,"Músicas para Acordar"));
		mapaCd.put(5, new BibCD("Vamos Malhar","Rocks Misturados",12,60,false,"Músicas de Academia"));
		
		
		mapaDvd.put(1, new BibDVD("Matrix", "Keanu",95,true,"Filme Legal"));
		mapaDvd.put(2, new BibDVD("Matrix Evolution", "Keanu",95,false,"Filme Chato"));
		mapaDvd.put(3, new BibDVD("Avengers", "Marvel",180,false,"Filme de Superheroi"));
		mapaDvd.put(4, new BibDVD("Liga da Justiça", "Superman",120,true,"Outro filme dde superheroi"));
		mapaDvd.put(5, new BibDVD("Monstro SA", "Boo",120,true,"Adoro esse filme"));
		
		
		
		
		
		do {
			System.out.println("Entre com a opcao desejada: \nCadastro Cd - digite 1\nCadastro DVD - digite 2"
					+ "\nBuscar CD ou DVD pelo Título  - digite 3\nDevolver um CD ou um DVD - digite 4"
					+ "\n Sair do sistema - digite 0");
			opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println("Entre com um novo registro de CD");
				System.out.println("Título de CD");
				titulo = sc.nextLine();
				System.out.println("Nome do Artista");
				artista = sc.nextLine();
				System.out.println("Número de Faixas");
				numeroMusicas = sc.nextInt();
				System.out.println("Tempo Total do CD");
				tempoTotal = sc.nextInt();
				System.out.println("Já possui cópia? \n se sim digita S \n digita N");
				possui = sc.nextLine();
				if(possui.equals("S")) {
					copia = true;
				}else {
					copia = false;
				}
				System.out.println("Adicione um comentário");
				comentario = sc.nextLine();
				cd++;
				mapaCd.put(cd, new BibCD(titulo,artista,numeroMusicas,tempoTotal,copia,comentario));
				break;
				
			case 2: 
				System.out.println("Entre com um novo registro de DVD");
				System.out.println("Título de DVD");
				titulo = sc.nextLine();
				System.out.println("Nome do Idealizador");
				artista = sc.nextLine();
				System.out.println("Tempo Total do Filme");
				tempoTotal = sc.nextInt();
				System.out.println("Já possui cópia? \n se sim digita S \n digita N");
				possui = sc.nextLine();
				if(possui.equals("S")) {
					copia = true;
				}else {
					copia = false;
				}
				System.out.println("Adicione um comentário");
				comentario = sc.nextLine();
				dvd++;
				mapaDvd.put(dvd, new BibDVD(titulo,artista,tempoTotal,copia,comentario));
				break;
				
			case 3: 
				System.out.println("Digite o titulo do CD ou DVD");
				titulo = sc.nextLine();
				boolean algo = true;
				
			   for(HashMap.Entry<Integer,BibCD> buscaNome : mapaCd.entrySet() ) {
				   
				  if( buscaNome.getValue().getTitulo().equals(titulo)) {
					  
					  System.out.println(buscaNome.getValue());
					 algo = false;
				  }
				   
			   }
			   if(algo) {
				   for(HashMap.Entry<Integer,BibDVD> buscaNome : mapaDvd.entrySet() ) {
					   
						  if( buscaNome.getValue().getTitulo().equals(titulo)) {
							  
							  System.out.println(buscaNome.getValue());
							 algo = false;
						  }
						   
					   }
			   }
			   
			   
				
				break;
				
				
			}
			
			
		}while(opcao == 0);
	
		

	}

}
