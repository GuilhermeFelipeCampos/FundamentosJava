import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha;
        /* alternativa 1 
        do{
            senha = teclado.nextInt();
            if (senha == 2002){
                System.out.println("Acesso Permitido");
            }
            else{
                System.out.println("Senha Invalida");
            }
        } while(senha != 2002); */

        /* alternativa 2 
        do {
            senha = teclado.nextInt();
            if (senha != 2002){
                System.out.println("Senha Invalida");
            }
        } while (senha != 2002);
        System.out.println("Acesso Permitido");*/

        /* alternativa 3 
        while(true){
            senha = teclado.nextInt();
            if (senha == 2002){
                System.out.println("Acesso Permitido");
                break;
            }
            else{
                System.out.println("Senha Invalida");
            }
        } */

        /* alternativa 4 */
        senha = teclado.nextInt();
        while (senha != 2002){
            System.out.println("Senha Invalida");                
            senha = teclado.nextInt();
        }
        System.out.println("Acesso Permitido");


        teclado.close();
    }
}