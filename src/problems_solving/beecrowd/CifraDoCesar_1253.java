package problems_solving.beecrowd;

import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

/*
Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César,
que trocava cada letra pelo equivalente em duas posições adiante no alfabeto
(por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). Ao final do alfabeto nós voltamos
para o começo, isto é 'Y' vira 'A'. Nós podemos, é claro, tentar trocar as letras
com quaisquer número de posições.

Entrada:
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N
que indica a quantidade de casos de teste. Cada caso de teste é composto por duas linhas.
A primeira linha contém uma string com até 50 caracteres maiúsculos ('A'-'Z'), que é a
sentença após ela ter sido codificada através desta Cifra de César modificada.
A segunda linha contém um número que varia de 0 a 25 e que representa quantas posições
cada letra foi deslocada para a direita.

Saída:
Para cada caso de teste de entrada, imprima uma linha de saída com o texto decodificado
(transformado novamente para o texto original) conforme as regras acima e o exemplo abaixo.

Exemplo de Entrada       Exemplo de Saída
-----------------------------------------
6
VQREQFGT                 TOPCODER
2
ABCDEFGHIJKLMNOPQRSTUVWXYZ     QRSTUVWXYZABCDEFGHIJKLMNOP
10
TOPCODER                 TOPCODER
0
ZWBGLZ                   AXCHMA
25
DBNPCBQ                  CAMOBAP
1
LIPPSASVPH               HELLOWORLD
4
*/


/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class CifraDoCesar_1253 {

    public static void main(String[] args) throws IOException {

        List<String> alfabeto = Arrays.asList("A", "B", "C", "D", "E", "F",
                "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                "T", "U", "V", "W", "X", "Y", "Z");

        Scanner scanner = new Scanner(System.in);

        int numeroInteracoes = scanner.nextInt();

        String[] palavrasCriptografadas = new String[numeroInteracoes];

        scanner.nextLine();

        for(int i = 0; i < numeroInteracoes ; i++){

            String[] palavras = scanner.nextLine().split("");

            int deslocamento = scanner.nextInt();
            scanner.nextLine();

            String palavraCriptografada = "";

            for(String letra : palavras){
                int indiceNoAlfabeto = alfabeto.indexOf(letra);

                if((indiceNoAlfabeto - deslocamento) < 0){

                    int posicao = (indiceNoAlfabeto - deslocamento + alfabeto.size()) % alfabeto.size();

                    palavraCriptografada += alfabeto.get(posicao);

                }else{
                    palavraCriptografada += alfabeto.get(indiceNoAlfabeto - deslocamento);
                }

            }

            palavrasCriptografadas[i] = palavraCriptografada;
        }

        for(int i = 0; i < numeroInteracoes ; i++){
            System.out.println(palavrasCriptografadas[i]);
        }

        scanner.close();

    }

}