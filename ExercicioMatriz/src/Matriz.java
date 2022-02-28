import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int matriz [][] = new int[12][12];
		double soma = 0, media = 0;;
		String escolha;
		
		for(int i = 0; i < 12; i++) {
			for(int k = 0; k < 12; k++) {
				
				System.out.println("Insira valor na linha "+1+" coluna "+k);
				matriz[i][k] = sc.nextInt();
						
			}
		}
		System.out.println("Escolha a operação:");
		escolha = sc.nextLine();
		switch(escolha) {
		case "O":
			for(int i = 1; i < 11 ; i++) {
				for(int j = 0; i< j; j++) {
					
				
					
				}
			}
			break;
			
		case "S":
			break;
			
		default:
			break;
		}
		
		
	}

}
