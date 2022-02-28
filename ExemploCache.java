public class ExemploCache{
    public static void main(String args[]){
        int matriz[][];
        matriz = new int[20000][20000];

        long ini, fim;
        ini = System.currentTimeMillis();
        for (int i=0; i<20000; i++){
            for (int j=0;j<20000;j++){
                matriz[j][i] = 1;
            }
        }
        fim = System.currentTimeMillis();

        System.out.println("Demorou "+(fim - ini)+ " para preencher");
    }
}