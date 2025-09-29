package problemsSolving.beecrowd;

/*
 * Faça um programa que leia um vetor A[100]. No final, mostre todas as posições
 * do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado
 * em cada uma das posições.
 *
 * Entrada:
 * A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.
 *
 * Saída:
 * Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição
 * do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.
 *
 * Exemplo de Entrada:
 * 0
 * -5
 * 63
 * -8.5
 * ...
 *
 * Exemplo de Saída:
 * A[0] = 0.0
 * A[1] = -5.0
 * A[3] = -8.5
 * ...
 */


import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SelecaoEmVetoI_1174 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[100];

        for(int i = 0; i < valores.length; i++){
            valores[i] = scanner.nextDouble();
        }

        for(int i = 0; i < valores.length; i++){
            if(valores[i] <= 10){
                System.out.printf("A[%d] = %.1f%n", i, valores[i]);
            }
        }

    }

}