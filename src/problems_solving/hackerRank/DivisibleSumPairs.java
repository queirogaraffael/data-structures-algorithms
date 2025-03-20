package problems_solving.hackerRank;

import java.util.List;

public class DivisibleSumPairs {
    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if((ar.get(i) + ar.get(j)) % k == 0){
                    count += 1;
                }
            }
        }
        return count;

    }
}
