package problemsSolving.hackerRank;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {

        int tamanhoMatriz = arr.size();

        int indiceInicialDiagonal1 = 0;
        int indiceInicialDiagonal2 = tamanhoMatriz - 1;

        int somaDiagonal1 = 0;
        int somaDiagonal2 = 0;

        for(List<Integer> linha : arr){

            somaDiagonal1 += linha.get(indiceInicialDiagonal1);
            somaDiagonal2 += linha.get(indiceInicialDiagonal2);

            indiceInicialDiagonal1 += 1;
            indiceInicialDiagonal2 -= 1;

        }

        return Math.abs(somaDiagonal1 - somaDiagonal2);

    }
}
