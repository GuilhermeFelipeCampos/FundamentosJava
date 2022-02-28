import javax.swing.JOptionPane;
public class Compras {

	public static void main(String[] args) {
		
		CartaoPre cartao = new CartaoPre("1111.2222.3333.4444","José das Coves",22,12,0);
		
		int opcao;
		double valor;
		boolean certo;
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:\n1 - Verificar saldo\n2 - Inserir valor\n3 - Efetuar Compra"));
		
		switch(opcao) {
		
		case 1:
			JOptionPane.showMessageDialog(null, "Seu Saldo é de \n"+cartao.getSaldo(),"INFORMATION",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja colocar no cartão"));
			cartao.setSaldo(valor);
			break;
		case 3:
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja efetuar a compra"));
			certo = cartao.comprar(valor);
			
			
			if(certo) {
				JOptionPane.showMessageDialog(null, "Saldo Insufuciente","ERROR",JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Saldo Insufuciente","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Obrigado por usar o cartão","CLOSE",JOptionPane.CLOSED_OPTION);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida","ERROR",JOptionPane.ERROR_MESSAGE);
			break;
		}
		

	}

}
