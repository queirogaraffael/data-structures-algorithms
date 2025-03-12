package study.algorithms.searching;

import java.util.Arrays;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        // Caso base: se o primeiro elemento for o alvo
        if (arr[0] == target) {
            return 0;
        }

        // Encontra o intervalo exponencialmente
        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }

        // Realiza busca binária na faixa encontrada
        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 15, 20, 25, 30};
        int target = 10;

        int result = exponentialSearch(arr, target);
        if (result >= 0) {
            System.out.println("Elemento encontrado no índice: " + result);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
}
