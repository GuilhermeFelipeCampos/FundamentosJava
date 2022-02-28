import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		System.out.println("Hello World!!!!");
		
		int valor = tc.nextInt();
		
		System.out.println("O valor digitado foi "+valor);
		
		tc.close();
	}

}
