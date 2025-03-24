package problems_solving.hackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Integer> contaFrequencia = new HashMap<>();

        int frequenciaMaior = 0;
        int tipoMenor = arr.get(0);

        for(int i = 0; i < arr.size(); i++){

            int key = arr.get(i);

            if(contaFrequencia.containsKey(key)){

                int novaFrequencia = contaFrequencia.get(key) + 1;

                contaFrequencia.put(key, novaFrequencia);

                if(novaFrequencia > frequenciaMaior){
                    frequenciaMaior = novaFrequencia;
                    tipoMenor = key;
                }else if(novaFrequencia == frequenciaMaior && key < tipoMenor){
                    tipoMenor = key;
                }

            }else{
                contaFrequencia.put(key, 1);
            }

        }

        return tipoMenor;


    }
}
