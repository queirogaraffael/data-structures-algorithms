package problemsSolving.beecrowd;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class BalancoParentesesI {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String expressao = scanner.nextLine();
            System.out.println(avaliaExpressao(expressao));
        }

        scanner.close();
    }


    public static String avaliaExpressao(String expressao) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expressao.length(); i++) {
            char elemento = expressao.charAt(i);

            if (elemento == '(') {
                stack.push(elemento);
            } else if (elemento == ')') {
                if (stack.isEmpty()) {
                    return "incorrect";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "correct" : "incorrect";

    }


}