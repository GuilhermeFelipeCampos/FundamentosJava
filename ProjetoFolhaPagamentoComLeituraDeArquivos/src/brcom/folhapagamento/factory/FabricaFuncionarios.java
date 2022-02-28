package brcom.folhapagamento.factory;

import br.com.folhapagamento.exceptions.DadosInvalidosException;
import br.com.folhapagamento.exceptions.EstruturaDeFuncionarioInvalida;
import br.com.folhapagamento.exceptions.TXTFormatException;
import br.com.folhapagamento.model.Chefe;
import br.com.folhapagamento.model.Comissionado;
import br.com.folhapagamento.model.Empreiteiro;
import br.com.folhapagamento.model.Funcionario;
import br.com.folhapagamento.model.Horista;

public class FabricaFuncionarios {

	public static Funcionario criarFuncionarioFromTXT(String linha) {
		
		
		try {
		String[] dados = linha.split(";");
		switch (dados[0].trim()) {
		
		case "1":
			return new Chefe(dados[2].trim(),
					Integer.parseInt(dados[1].trim()),	
					Double.parseDouble(dados[3].trim()),
					Double.parseDouble(dados[4].trim()),
					Double.parseDouble(dados[5].trim()));
			
			
			
		case "2":
			
			return new Comissionado(dados[2].trim(),
					Integer.parseInt(dados[1].trim()),	
					Double.parseDouble(dados[3].trim()),
					Double.parseDouble(dados[4].trim()));
					
				
			
			
		case "3":
			
			return new Horista(dados[2].trim(),
					Integer.parseInt(dados[1].trim()),	
					Double.parseDouble(dados[4].trim()),
					Integer.parseInt(dados[3].trim()));
					
			
			
		case "4":
			
			return new Empreiteiro(dados[2].trim(),
						Integer.parseInt(dados[1].trim()),
						Double.parseDouble(dados[3].trim()));
			
			
			default:
				
				throw new TXTFormatException("Tipo Inválido");
		}	
		
		
		
		}catch(NumberFormatException e) {
			
		 throw new DadosInvalidosException("Erro ao converter informações do funcionário");
		 
		}catch(ArrayIndexOutOfBoundsException e) {
			
			 throw new EstruturaDeFuncionarioInvalida("Dados imcompletos para o funcionario");
			 
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro desconhecido");
			
		}
		
		
		
	}
}
