import javax.swing.JOptionPane;
public class BibliotecaGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Livro livro = new Livro();
		
		int opcao;
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo a Biblioteca!!\nPor favor digite a opção desejada:"
			                                            	+ "\n1 - Exibir Livros\n2 - Emprestar Livros\n3 - Devolver livro\n4 - Inserir novo livro\n 5 Sair"));
		
		switch(opcao) {
		
		case 1:
			JOptionPane.showMessageDialog(null, livro.exibirInformacao());
			break;
		case 2:
			if(livro.isEmprestimo() == true ) {
				livro.emprestar();
				
			}else {
				
				JOptionPane.showMessageDialog(null, " O livro "+livro.getTitulo()+" não se encontra disponível!");
				
			}		
		
			break;
		case 3:
			livro.devolver();
			break;
		case 4:
			
			break;
		case 5:
			break;
		default:
			break;
		}
		
		
	
	}

}
