import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        // primeira coisa - declarar uma "variável" do tipo Scanner
        // segunda coisa - instanciar o componente teclado apontando o dispositivo de entrada padrão
        Scanner teclado = new Scanner(System.in);

        int valorI;
        double valorD;
        System.out.println("Digite um valor inteiro");
        valorI = teclado.nextInt();
        System.out.println("Você digitou o valor " + valorI);

        System.out.println("Agora digtite um valor REAL!!!");
        valorD = teclado.nextDouble();
        System.out.println("Voce digitou o valor " + valorD);
        teclado.close();
    }
}