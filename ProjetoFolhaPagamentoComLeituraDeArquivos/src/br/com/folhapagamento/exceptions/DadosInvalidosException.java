package br.com.folhapagamento.exceptions;

public class DadosInvalidosException extends RuntimeException{

	public DadosInvalidosException(String mensagem) {
		super(mensagem);
	}
}
