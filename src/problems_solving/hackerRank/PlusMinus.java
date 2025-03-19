package problems_solving.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        List<Integer> quantidades = new ArrayList<>(Arrays.asList(0,0,0));

        for(int i = 0; i < arr.size(); i++){

            if (arr.get(i) > 0){
                quantidades.set(0, quantidades.get(0) + 1);
            }else if(arr.get(i) < 0){
                quantidades.set(1, quantidades.get(1) + 1);
            }else{
                quantidades.set(2, quantidades.get(2) + 1);
            }

        }


        for(int i = 0; i < quantidades.size(); i++){
            if(quantidades.get(i) != 0){
                Float proporcao = (float) quantidades.get(i) / arr.size();
                System.out.printf("%.6f%n", proporcao);
            }else{
                System.out.printf("0.000000%n");

            }

        }

    }
}
