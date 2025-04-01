package problems_solving.beecrowd;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ColunaNaMatriz1182 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        float[][] matriz = new float[12][12];

        int opcaoColuna = scanner.nextInt();

        scanner.nextLine();

        char opcao = scanner.nextLine().charAt(0);

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                matriz[linha][coluna] = scanner.nextFloat();
            }
        }

        if(opcao == 'S'){
            float soma = somaElementosColunaMatriz(matriz, opcaoColuna);
            System.out.printf("%.1f%n", soma);
        }else{
            float media = somaElementosColunaMatriz(matriz, opcaoColuna)/ matriz.length;
            System.out.printf("%.1f%n", media);
        }


        scanner.close();

    }

    public static float somaElementosColunaMatriz(float[][] matriz, int coluna){
        float soma = 0;

        for(int linha = 0; linha < matriz.length; linha++){
            soma += matriz[linha][coluna];
        }

        return soma;

    }

}