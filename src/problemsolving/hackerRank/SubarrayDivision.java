package problemsSolving.hackerRank;

import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int contador = 0;
        int somaAtual = 0;

        for(int i = 0; i < m; i++){
            somaAtual += s.get(i);
        }

        if(somaAtual == d){
            contador += 1;
        }

        for(int i = m; i < s.size(); i++){
            somaAtual += s.get(i) - s.get(i - m);

            if(somaAtual == d){
                contador += 1;
            }
        }

        return contador;

    }
}
