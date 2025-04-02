package study.algorithms.searching.binarySearch;

import java.util.Arrays;

public class BuscaNativa {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9};
        int indice = Arrays.binarySearch(numeros, 7);

        if (indice >= 0) {
            System.out.println("Elemento encontrado no índice " + indice);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
}
