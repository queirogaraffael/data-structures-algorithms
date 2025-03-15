package problems_solving.hackerRank;
import java.util.List;


public class MiniMaxSum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;


        long somaTotal = 0;

        for(int i = 0; i < arr.size(); i++){
            somaTotal += arr.get(i);

            if(arr.get(i) < menorValor){
                menorValor = arr.get(i);
            }

            if(arr.get(i) > maiorValor){
                maiorValor = arr.get(i);
            }
        }

        long minSum = somaTotal - maiorValor;
        long maxSum = somaTotal - menorValor;


        System.out.print(minSum + " " + maxSum);

    }
}
