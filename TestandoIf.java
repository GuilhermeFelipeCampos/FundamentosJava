import java.util.Scanner;

public class TestandoIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double n1, n2, me;

        System.out.println("Digite a Nota 1 e Nota 2");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        me = (n1 + n2)/2;

        System.out.printf("Sua Media final vale %.2f\n",me);
        if (me >= 6.0 ) {
            System.out.println("Aprovado - Parabens!");
            System.out.println("Professor curtiu a aprovação!!!");
        } else{
            System.out.println("Oba nos vemos ano que vem!");
        }
        System.out.println("Fim do programa");
        
        teclado.close();
    }

}