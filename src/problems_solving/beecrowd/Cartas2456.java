package problems_solving.beecrowd;
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
        Scanner scanner = new Scanner(System.in);

        String[] linha = scanner.nextLine().split(" ");

        boolean crescente = true;
        boolean descrecente = true;

        for(int i = 0; i < linha.length - 1; i++){
            int valorAtual = Integer.parseInt(linha[i]);
            int proximoValor = Integer.parseInt(linha[i + 1]);

            if(valorAtual < proximoValor){
                descrecente = false;
            }else if(valorAtual > proximoValor){
                crescente = false;
            }

        }

        if(crescente){
            System.out.println("C");
        }else if(descrecente){
            System.out.println("D");
        }else{
            System.out.println("N");
        }

        scanner.close();


    }

}