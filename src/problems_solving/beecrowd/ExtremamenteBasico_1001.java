package problems_solving.beecrowd;

import java.io.IOException;
import java.util.Scanner;

// Leia 2 valores inteiros e armazene-os nas variáveis A e B.
// Efetue a soma de A e B atribuindo o seu resultado na variável X.
// Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

// Entrada
// A entrada contém 2 valores inteiros.

// Saída
// Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha.
// Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.

// Exemplos de Entrada 	Exemplos de Saída
// 10                    X = 19
// 9
//
// -10                   X = -6
// 4
//
// 15                    X = 8
// -7

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ExtremamenteBasico_1001 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int soma = a + b;

        System.out.println("X = " + soma);

        scanner.close();

    }

}