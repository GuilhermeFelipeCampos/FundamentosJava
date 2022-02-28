import java.util.Scanner;

public class SayHello{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String idioma;

        System.out.println("Digite o idioma desejado");
        idioma = teclado.nextLine();

        switch(idioma){
            case "br":
            case "BR":
            case "PT-BR":
            case "pt-br":
            case "Pt-Br":
               System.out.println("Ola Mundo!");
               break;
            case "ing":
            case "eng":
            case "Ing":
            case "ING":
            case "ENG":
            case "Eng":
            case "US":
            case "us":
                System.out.println("Hello World");
                break;
            case "IT":
            case "it":
            case "It":
                System.out.println("Ciao Mondo -q");
                break;
            default:
                System.out.println("Num sei falá");
                break;

        }

        int a, b;
        a = teclado.nextInt();
        b = teclado.nextInt();
        int c;
        c = (a > b)? a: b;
        System.out.println(" O maior valor entre A e B é "+c);

        teclado.close();
    }
}