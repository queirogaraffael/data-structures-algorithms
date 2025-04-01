package problems_solving.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        List<Integer> quantidades = Arrays.asList(0,0,0);

        for(Integer valor : arr){

            if (valor > 0){
                quantidades.set(0, quantidades.get(0) + 1);
            }else if(valor < 0){
                quantidades.set(1, quantidades.get(1) + 1);
            }else{
                quantidades.set(2, quantidades.get(2) + 1);
            }

        }

        for(Integer quantidade : quantidades){
            if(quantidade != 0){
                Float proporcao = (float) quantidade / arr.size();
                System.out.printf("%.6f%n", proporcao);
            }else{
                System.out.printf("0.000000%n");
            }
        }
    }
}
