package problemsSolving.beecrowd;
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Cartas2456 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();

        String[] valores = entrada.split(" ");

        boolean crescente = false;
        boolean descrescente = false;

        for (int i = 1; i < valores.length; i++) {

            int valorAnterior = Integer.parseInt(valores[i - 1]);
            int valorAtual = Integer.parseInt(valores[i]);

            if (valorAnterior < valorAtual) {
                crescente = true;
            }

            if (valorAnterior > valorAtual) {
                descrescente = true;
            }
        }

        if (crescente && descrescente) {
            System.out.print("N");
        } else if (descrescente) {
            System.out.print("D");
        } else {
            System.out.print("C");
        }

        sc.close();
    }

}