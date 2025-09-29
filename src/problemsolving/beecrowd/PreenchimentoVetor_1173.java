package problemsSolving.beecrowd;

import java.io.IOException;
import java.util.Scanner;

/*
    Leia um valor e faça um programa que coloque o valor lido
    na primeira posição de um vetor N[10].

    Em cada posição subsequente, coloque o dobro do valor da posição anterior.
    Por exemplo, se o valor lido for 1, os valores do vetor devem ser:
    1, 2, 4, 8 e assim sucessivamente.

    Mostre o vetor em seguida.

    Entrada:
    - A entrada contém um valor inteiro (V <= 50).

    Saída:
    - Para cada posição do vetor, escreva "N[i] = X",
      onde i é a posição do vetor e X é o valor armazenado na posição i.
    - O primeiro número do vetor N (N[0]) irá receber o valor de V.

    Exemplo de Entrada:
    1

    Exemplo de Saída:
    N[0] = 1
    N[1] = 2
    N[2] = 4
    ...
*/


/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class PreenchimentoVetor_1173 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[10];

        int x = scanner.nextInt();

        valores[0] = x;

        for(int i = 1; i < valores.length; i++){
            valores[i] = valores[i -1] * 2;
        }

        for(int i = 0; i < valores.length; i++){
            System.out.printf("N[%d] = %d%n", i, valores[i]);
        }

        scanner.close();

    }

}