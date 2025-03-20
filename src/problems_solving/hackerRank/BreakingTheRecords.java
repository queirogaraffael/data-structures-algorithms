package problems_solving.hackerRank;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int min = scores.get(0);
        int max = scores.get(0);

        int countMin = 0;
        int countMax = 0;

        for(int i = 1; i < scores.size(); i++){

            if(scores.get(i) > max){
                max = scores.get(i);
                countMax += 1;
            }

            if(scores.get(i) < min){
                min = scores.get(i);
                countMin += 1;
            }

        }

        return Arrays.asList(countMax, countMin);

    }
}
