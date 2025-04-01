package problems_solving.hackerRank;
import java.util.List;


public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;

        long somaTotal = 0;

        for(Integer valor : arr){
            int valorAtual = valor;

            somaTotal += valorAtual;

            if(valorAtual < menorValor){
                menorValor = valorAtual;
            }

            if(valorAtual > maiorValor){
                maiorValor = valorAtual;
            }
        }

        long minSum = somaTotal - maiorValor;
        long maxSum = somaTotal - menorValor;


        System.out.print(minSum + " " + maxSum);

    }
}
