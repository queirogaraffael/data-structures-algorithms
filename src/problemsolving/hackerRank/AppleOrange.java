package problemsSolving.hackerRank;

import java.util.List;

public class AppleOrange {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int countMaca = 0;
        int countOrange = 0;

        for(int i = 0; i < apples.size(); i++){
            int posicao = a + apples.get(i);

            if(posicao >= s && posicao <= t){
                countMaca += 1;
            }
        }


        for(int i = 0; i < oranges.size(); i++){
            int posicao = b + oranges.get(i);

            if(posicao >= s && posicao <= t){
                countOrange += 1;
            }
        }

        System.out.println(countMaca);
        System.out.println(countOrange);

    }

}
