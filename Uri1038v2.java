import java.util.Scanner;
public class Uri1038v2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int qtd, codigo;
        double total;

        codigo = teclado.nextInt();
        qtd    = teclado.nextInt();

        if (codigo == 1){   // código é 1? Beleza só calcular
            total = qtd * 4.0;
        }
        else if (codigo == 2){  // já que não é o 1, testo se é o 2
            total = qtd * 4.50;
        }
        else if (codigo == 3){
            total = qtd * 5.0;
        }
        else if (codigo == 4){
            total = qtd * 2.0;
        }
        else{
            total = qtd * 1.50;
        }        
        System.out.printf("Total: R$ %.2f\n", total);

        teclado.close();
    }
}