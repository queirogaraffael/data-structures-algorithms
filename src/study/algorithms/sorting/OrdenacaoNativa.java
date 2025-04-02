package study.algorithms.sorting;

import java.util.Arrays;

public class OrdenacaoNativa {
    public static void main(String[] args) {
        int[] numeros = {7, 2, 9, 3, 6};

        // Ordena o array
        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros)); // [2, 3, 6, 7, 9]
    }
}
