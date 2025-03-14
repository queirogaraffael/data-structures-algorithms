package problems_solving.hackerRank;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {

        int quantidade = 0;

        for(int i = 0; i < candles.size(); i++){
            int frequencia = Collections.frequency(candles, candles.get(i));

            if(frequencia > quantidade){
                quantidade = frequencia;

            }
        }

        return quantidade;

    }
}
