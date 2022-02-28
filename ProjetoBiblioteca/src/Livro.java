
public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicado;
	private String categoria;
	private int estante;
	private int prateleira;
	private boolean emprestimo;
	
	
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicado() {
		return anoPublicado;
	}
	public void setAnoPublicado(int anoPublicado) {
		this.anoPublicado = anoPublicado;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getEstante() {
		return estante;
	}
	public void setEstante(int estante) {
		this.estante = estante;
	}
	public int getPrateleira() {
		return prateleira;
	}
	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}
	public boolean isEmprestimo() {
		return emprestimo;
	}
	
	
	public void emprestar() {
		this.emprestimo = false;
	}
	
	public void devolver() {
		this.emprestimo = true;
	}
	
	public String exibirInformacao() {
		String mensagem;
		mensagem = "Livro: "+titulo+ "/"+" autor"+ "("+anoPublicado+")\nCategoria: "+categoria+
				"\nLocalizado na estante :"+estante+"\n Na preteleira:"+prateleira+
				"Seu estado está :"+(emprestimo ? "Disponível" : "Emprestado");
		
				
		return mensagem;		
				
	}
	
	
	
}
