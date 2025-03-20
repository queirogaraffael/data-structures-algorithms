package problems_solving.beecrowd;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ParesImpares1259 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int n = scanner.nextInt();

        int valor;

        for(int i = 0; i < n; i++){
            valor = scanner.nextInt();

            if(valor % 2 == 0){
                pares.add(valor);
            }
            else{
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        for(int i = 0; i < pares.size(); i++){
            System.out.println(pares.get(i));
        }

        for(int i = 0; i < impares.size(); i++){
            System.out.println(impares.get(i));
        }

        scanner.close();

    }

}