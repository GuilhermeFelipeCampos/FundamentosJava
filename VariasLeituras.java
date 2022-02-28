import java.util.Scanner;

public class VariasLeituras{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor1, valor2;
        double valor3;
        String nome;      
        String texto;

        System.out.println("Digite alguns valores");
        valor1 = Integer.parseInt(teclado.nextLine());
        valor2 = Integer.parseInt(teclado.nextLine());
        valor3 = Double.parseDouble(teclado.nextLine());

        System.out.println("Voce digitou:"+valor1+" - "+valor2+ " - "+valor3);
        System.out.printf("Voce tambe digitou: %d - %d - %.2f\n",valor1,valor2,valor3);

        System.out.println("Por favor digite seu nome");
        nome = teclado.nextLine();
        System.out.println("Seu nome eh:"+nome);
        /*System.out.println("Digite outro texto agora");
        texto = teclado.nextLine();
        System.out.println("Agora voce digitou "+ texto);*/

        teclado.close();
    }
}