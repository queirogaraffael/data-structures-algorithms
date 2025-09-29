package problemsSolving.hackerRank;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {

        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int candle : candles) {
            if (candle > max) {
                max = candle;
                count = 1;
            } else if (candle == max) {
                count += 1;
            }
        }

        return count;

    }
}
