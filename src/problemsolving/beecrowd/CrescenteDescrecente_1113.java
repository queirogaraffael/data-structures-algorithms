package problemsSolving.beecrowd;



// Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
// Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
//
// Entrada:
// A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y.
// A leitura deve ser encerrada ao serem fornecidos valores iguais para X e Y.
//
// Saída:
// Para cada caso de teste, imprima “Crescente” caso os valores tenham sido digitados em ordem crescente,
// caso contrário, imprima a mensagem “Decrescente”.
//
// Exemplo de Entrada        Exemplo de Saída
// 5 4                      Decrescente
// 7 2                      Decrescente
// 3 8                      Crescente
// 2 2                      (fim da leitura)



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class CrescenteDescrecente_1113 {

    public static String analisaSeEHCrescenteOuDescrecente(Integer a, Integer b){

        if (a > b){
            return "Decrescente";
        }else {
            return "Crescente";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> resultado = new ArrayList<>();

        String[] valores = sc.nextLine().split(" ");

        int valor1 = Integer.parseInt(valores[0]);
        int valor2 = Integer.parseInt(valores[1]);


        while(valor1 != valor2){
            resultado.add(analisaSeEHCrescenteOuDescrecente(valor1, valor2));
            valores = sc.nextLine().split(" ");

            valor1 = Integer.parseInt(valores[0]);
            valor2 = Integer.parseInt(valores[1]);
        }

        for(String res : resultado){
            System.out.println(res);
        }

        sc.close();
    }

}