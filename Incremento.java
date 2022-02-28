public class Incremento{
    public static void main(String args[]){

        // explicitar a diferença entre ++a e a++

        int a = 5;
        System.out.println("Valor original do a = "+a);

        System.out.println("---> Testando pós incremento a++");
        System.out.println(a++); // equivale a: System.out.println(a); a = a + 1;
        System.out.println(a);

        a = 5;
        System.out.println("Valor original do a = "+a);
        
        System.out.println("---> Testando o pré incremento ++a");
        System.out.println(++a); // equivale a: a = a + 1; System.out.println(a);
        System.out.println(a);

    }
}