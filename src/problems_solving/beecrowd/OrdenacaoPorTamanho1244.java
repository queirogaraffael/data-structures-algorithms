package problems_solving.beecrowd;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

/*
 * Ordenação por Tamanho
 *
 * Por TopCoder* EUA
 * Timelimit: 1
 *
 * Crie um programa para ordenar um conjunto de strings pelo seu tamanho.
 * Seu programa deve receber um conjunto de strings e retornar este mesmo
 * conjunto ordenado pelo tamanho das palavras. Se o tamanho das strings
 * for igual, deve-se manter a ordem original do conjunto.
 *
 * Entrada:
 * A primeira linha da entrada possui um único inteiro N, que indica o número
 * de casos de teste. Cada caso de teste poderá conter de 1 a 50 strings
 * inclusive, e cada uma das strings poderá conter entre 1 e 50 caracteres
 * inclusive. Os caracteres poderão ser espaços, letras ou números.
 *
 * Saída:
 * A saída deve conter o conjunto de strings da entrada ordenado pelo tamanho
 * das strings. Um espaço em branco deve ser impresso entre duas palavras.
 *
 * Exemplo de Entrada:
 * 4
 * Top Coder comp Wedn at midnight
 * one three five
 * I love Cpp
 * sj a sa df r e w f d s a v c x z sd fd
 *
 * Exemplo de Saída:
 * midnight Coder comp Wedn Top at
 * three five one
 * love Cpp I
 * sj sa df sd fd a r e w f d s a v c x z
 */


/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class OrdenacaoPorTamanho1244 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        String[] frases = new String[n];

        for(int i = 0; i < n; i++){
            String[] frase = scanner.nextLine().split(" ");

            String fraseOrdenada = ordenaStrings(frase);

            frases[i] = fraseOrdenada;
        }

        for(int i = 0; i < frases.length; i++){
            System.out.println(frases[i]);
        }

        scanner.close();

    }

    public static String ordenaStrings(String[] frase){
        Arrays.sort(frase, Comparator.comparingInt(String::length).reversed());

        return String.join(" ", frase);
    }

}