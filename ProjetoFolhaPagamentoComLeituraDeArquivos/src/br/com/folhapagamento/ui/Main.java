package br.com.folhapagamento.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.folhapagamento.model.Funcionario;
import brcom.folhapagamento.factory.FabricaFuncionarios;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
		try {
		File file = new File("./ListaFuncionarios.txt");
		
		FileReader reader = new FileReader(file);
		
		BufferedReader buffer = new BufferedReader(reader);
			String dadosFuncionarios = "";
			
			do {
				
				dadosFuncionarios = buffer.readLine();
				if(dadosFuncionarios != null) {
					
					funcionario.add(FabricaFuncionarios.criarFuncionarioFromTXT(dadosFuncionarios));
				}
				
				
			}while(dadosFuncionarios != null);
			
			buffer.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.print("Deseja Gerar um Arquivo ou Visualizar os arquivos em Tela?\nSim - 1\nNão - 2\n");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			try {
				
				File file = new File("./FolhaPagamento.txt");
				FileWriter fw = new FileWriter(file,true);

				for(Funcionario func : funcionario) {
					
					fw.write(func.toString());
				}
				
			fw.close();
			sc.close();
			}catch(Exception e) {
				System.err.println("Erro ao gravar no arquivo!!");
			}
			
			
		}else if(opcao == 2) {
			
			for(Funcionario func: funcionario) {
				
				System.out.println(func);
			}
		}else {
			
			System.out.println("Opção Inválida");
		}
		

	}

}
