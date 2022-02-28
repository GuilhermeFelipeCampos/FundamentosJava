public class ExemploContinue{
    public static void main(String args[]){
/*
        for (int numero = 1; numero < 10; numero++){

            if (numero == 5){
                System.out.println("Chegou no 5!!! E agora??? Socooooorroooooooooo");
                continue;
            }
            System.out.println("O numero = "+numero);
        }*/

        // tentando reescrever a mesma coisa com while

        int numero = 1;
        while (numero < 10) {
            if (numero == 5){
                System.out.println("Chegou no 5!!! E agora??? Socooooorroooooooooo");
                numero++;
                continue;
            }
            System.out.println("O numero = "+numero);
            numero++;
        }
    }
}