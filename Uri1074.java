import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n, numero;
        n = teclado.nextInt(); // esse N me dá o número de repetições
        for (int cont = 0; cont < n; cont++){
            numero = teclado.nextInt();
            if (numero == 0){
                System.out.println("NULL");
            }
            else if (numero %2 == 0){
                System.out.print("EVEN "); 
            }
            else{
                System.out.print("ODD ");
            }
            if (numero > 0){
                System.out.println("POSITIVE");
            }
            else if (numero < 0){
                System.out.println("NEGATIVE");
            }
        }



        teclado.close();
    }
}