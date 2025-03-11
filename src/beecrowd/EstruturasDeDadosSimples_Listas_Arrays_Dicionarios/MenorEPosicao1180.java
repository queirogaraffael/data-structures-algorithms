package beecrowd.EstruturasDeDadosSimples_Listas_Arrays_Dicionarios;

import java.io.IOException;
import java.util.Scanner;


/*
Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N].
A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor
e a sua posição dentro do vetor, mostrando esta informação.

Entrada:
A primeira linha de entrada contém um único inteiro N (1 < N < 1000),
indicando o número de elementos que deverão ser lidos em seguida para o vetor X[N] de inteiros.
A segunda linha contém cada um dos N valores, separados por um espaço.
Vale lembrar que em nenhuma entrada haverá números repetidos.

Saída:
A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço
e do menor valor lido na entrada.
A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição
do vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero.

Exemplo de Entrada:
10
1 2 3 4 -5 6 7 8 9 10

Exemplo de Saída:
Menor valor: -5
Posicao: 4
*/


/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class MenorEPosicao1180 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] valores = new int[n];

        for(int i = 0; i < valores.length; i++){
            valores[i] = scanner.nextInt();
        }

        int menorValor = valores[0];
        int posicaoMenorValor = 0;

        for(int i = 0; i < valores.length; i++){
            if (valores[i] < menorValor){
                menorValor = valores[i];
                posicaoMenorValor = i;
            }
        }

        System.out.printf("Menor valor: %d%n", menorValor);
        System.out.printf("Posicao: %d%n", posicaoMenorValor);

        scanner.close();
    }

}