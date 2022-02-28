package br.com.bibliotecamultimidia.model;

import java.util.Objects;

public class BibCD {
	
	private String titulo;
	private String artista;
	private int numeroMusicas;
	private int tempoTotal;
	private boolean copia;
	private String cometario;
	
	
	public BibCD(String titulo, String artista, int numeroMusicas, int tempoTotal, boolean copia, String cometario) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.numeroMusicas = numeroMusicas;
		this.tempoTotal = tempoTotal;
		this.copia = copia;
		this.cometario = cometario;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public int getNumeroMusicas() {
		return numeroMusicas;
	}


	public void setNumeroMusicas(int numeroMusicas) {
		this.numeroMusicas = numeroMusicas;
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


	public String getCometario() {
		return cometario;
	}


	public void setCometario(String cometario) {
		this.cometario = cometario;
	}

	

	@Override
	public String toString() {
		return "BibCD [titulo=" + titulo + ", artista=" + artista + ", numeroMusicas=" + numeroMusicas + ", tempoTotal="
				+ tempoTotal + ", copia=" + copia + ", cometario=" + cometario + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}


	
	

}
