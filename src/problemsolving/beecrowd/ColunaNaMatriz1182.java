package problemsSolving.beecrowd;

import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ColunaNaMatriz1182 {

    public static double calculaMediaColuna(int numeroColuna, double[][] matriz){

        double soma = 0;

        for(int j = 0; j < matriz.length; j++){
            soma += matriz[j][numeroColuna];
        }

        return soma/matriz.length;

    }

    public static double calculaSomaColuna(int numeroColuna, double[][] matriz){
        double soma = 0;

        for(int j = 0; j < matriz.length; j++){
            soma += matriz[j][numeroColuna];
        }

        return soma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[12][12];

        int numeroColuna = sc.nextInt();
        sc.nextLine();

        char operacao = sc.next().charAt(0);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[j][i] = sc.nextDouble();
            }
        }

        if(operacao == 'M'){
            System.out.printf("%.1f\n", calculaMediaColuna(numeroColuna, matriz));
        }else{
            System.out.printf("%.1f\n", calculaSomaColuna(numeroColuna, matriz));
        }

        sc.close();

    }
}