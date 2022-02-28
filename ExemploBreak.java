public class ExemploBreak{
    public static void main(String args[]){

        for (int numero = 1; numero <= 10; numero++){
            System.out.println("Numero = "+numero);
            if (numero == 5){
               break;
            }
        }
        System.out.println("Fim do programa");
    }
}