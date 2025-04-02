package study.algorithms.searching.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuscaLista {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 2, 4, 6, 8, 10);

        int indice = Collections.binarySearch(numeros, 6);

        if (indice >= 0) {
            System.out.println("Elemento encontrado no índice " + indice);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
}
