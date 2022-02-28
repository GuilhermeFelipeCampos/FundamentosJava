import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaI, horaF, tempo;
        horaI = teclado.nextInt();
        horaF = teclado.nextInt();

        tempo = horaF - horaI;

        if (tempo <= 0){
            tempo = tempo + 24;
        }

        System.out.println("O JOGO DUROU "+tempo+ " HORA(S)");

        teclado.close();
    }
}