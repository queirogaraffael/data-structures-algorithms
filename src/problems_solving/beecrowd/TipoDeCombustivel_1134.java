package problems_solving.beecrowd;

import java.io.IOException;
import java.util.Scanner;

/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
 * Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
 * 1.Álcool, 2.Gasolina, 3.Diesel, 4.Fim).
 * Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código
 * (até que seja válido). O programa será encerrado quando o código informado for o número 4.
 *
 * Entrada:
 * A entrada contém apenas valores inteiros e positivos.
 *
 * Saída:
 * Deve ser escrita a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível,
 * conforme exemplo.
 *
 * Exemplo de Entrada      Exemplo de Saída:
 *
 * 8
 * 1
 * 7
 * 2
 * 2
 * 4
 *
 * MUITO OBRIGADO
 * Alcool: 1
 * Gasolina: 2
 * Diesel: 0
 */


/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class TipoDeCombustivel_1134 {

    public static void main(String[] args) throws IOException {

        int alcool = 0, gasolina = 0, diesel = 0;

        Scanner scanner = new Scanner(System.in);

        int codigoCombustivel = scanner.nextInt();


        while(codigoCombustivel != 4){

            switch (codigoCombustivel){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    break;

            }

            codigoCombustivel = scanner.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        sb.append("MUITO OBRIGADO\n")
                .append("Alcool: ").append(alcool).append("\n")
                .append("Gasolina: ").append(gasolina).append("\n")
                .append("Diesel: ").append(diesel);

        System.out.println(sb.toString());

        scanner.close();
    }

}