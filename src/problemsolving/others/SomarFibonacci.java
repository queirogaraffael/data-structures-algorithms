package problemsolving.others;

public class SomarFibonacci {

    public static int somaFibonacciAteAnterior(int valorAte){
        int a = 0;
        int b = 1;
        int soma = 0;

        for(int i = 0; i < valorAte; i++) {
            soma += a;
            int temp = a + b;
            a = b;
            b = temp;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println(somaFibonacciAteAnterior(5));
    }

}
