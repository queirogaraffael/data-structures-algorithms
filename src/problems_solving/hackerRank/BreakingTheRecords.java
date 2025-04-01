package problems_solving.hackerRank;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int min = scores.get(0);
        int max = scores.get(0);

        int countMin = 0;
        int countMax = 0;

        for(int i = 1; i < scores.size(); i++){
            int score = scores.get(i);

            if(score > max){
                max = score;
                countMax += 1;
            }

            if(score < min){
                min = score;
                countMin += 1;
            }

        }

        return Arrays.asList(countMax, countMin);

    }
}
