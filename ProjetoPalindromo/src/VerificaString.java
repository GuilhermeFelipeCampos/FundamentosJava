import java.util.Scanner;
public class VerificaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String palavra;
		boolean verifica = true;
		
		System.out.println("Escreva uma frase ou uma palavra:");
		palavra = sc.nextLine();
		char nova[] = palavra.toCharArray();
		for(int i = 0; i < palavra.length() - 1; i++) {
		
			if(palavra.charAt(i)!=nova[palavra.length() -1 -i]) {
			
				verifica = false;
				break;
			}
			
		}
		System.out.println(verifica?"É palindromo":"Não é Palindromo");

	}

}
