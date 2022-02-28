package br.com.bibliotecamultimidia.model;


public class BibDVD {
	
	private String titulo;
	private String nomeIdealizador;
	private int tempoTotal;
	private boolean copia;
	private String comentario;
	
	
	
	public BibDVD(String titulo, String nomeIdealizador, int tempoTotal, boolean copia, String comentario) {
		super();
		this.titulo = titulo;
		this.nomeIdealizador = nomeIdealizador;
		this.tempoTotal = tempoTotal;
		this.copia = copia;
		this.comentario = comentario;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getNomeIdealizador() {
		return nomeIdealizador;
	}



	public void setNomeIdealizador(String nomeIdealizador) {
		this.nomeIdealizador = nomeIdealizador;
	}



	public int getTempoTotal() {
		return tempoTotal;
	}



	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}



	public boolean isCopia() {
		return copia;
	}



	public void setCopia(boolean copia) {
		this.copia = copia;
	}



	public String getComentario() {
		return comentario;
	}



	public void setComentario(String comentario) {
		this.comentario = comentario;
	}



	@Override
	public String toString() {
		return "BibDVD [titulo=" + titulo + ", nomeIdealizador=" + nomeIdealizador + ", tempoTotal=" + tempoTotal
				+ ", copia=" + copia + ", comentario=" + comentario + "]";
	}




}
