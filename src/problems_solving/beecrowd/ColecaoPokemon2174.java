package problems_solving.beecrowd;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
Desde que foi lançado oficialmente o Pomekon no Brasil, Dabriel está tentando realizar seu maior sonho:
Ser um Mestre Pomekon. Sua meta é conquistar os 151 Pomekons disponíveis. Ele já conseguiu capturar
muitos monstrinhos, porém em sua cidade aparecem muitos Pomekons repetidos, fazendo com que ele capture
diversas vezes o mesmo Pomekon.

Vendo que sua mochila está bem cheia, Dabriel pediu para que você fizesse um programa de computador que
informasse a ele quantos Pomekons faltam para completar a coleção.

Entrada:
A primeira linha do caso de teste consiste de um inteiro N (1 ≤ N ≤ 10³), representando a quantidade de
Pomekons que Dabriel já capturou.
As próximas N linhas consistem de uma string S (1 ≤ |S| ≤ 10³), representando o nome de cada Pomekon.
O nome de cada Pomekon consiste apenas de letras maiúsculas e minúsculas.

Saída:
Você deverá imprimir: "Falta(m) X pomekon(s).", onde X representa a quantidade Pomekons não capturados.

Exemplos de Entrada  |  Exemplos de Saída

Entrada:
7
Charmander
Caterpie
Pidgeot
Rattata
Zubat
Zubat
Zubat

Saída:
Falta(m) 146 pomekon(s).

Entrada:
8
Zubat
Zubat
Zubat
Zubat
Zubat
Zubat
Zubat
Zubat

Saída:
Falta(m) 150 pomekon(s).
*/


/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ColecaoPokemon2174 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int metaConquistar = 151;

        Set<String> colecaoPokemon = new HashSet<>();

        int quantidade = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            String nomePokemon = scanner.nextLine();
            colecaoPokemon.add(nomePokemon);
        }

        int quantidadeFaltante = metaConquistar - colecaoPokemon.size();

        System.out.printf("Falta(m) %d pomekon(s).", quantidadeFaltante);

        scanner.close();
    }

}

