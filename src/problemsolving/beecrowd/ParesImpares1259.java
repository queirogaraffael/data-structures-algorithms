package problemsSolving.beecrowd;
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
        Scanner sc = new Scanner(System.in);

        List<Integer> impares = new ArrayList<>();

        List<Integer> pares = new ArrayList<>();

        int numeroDeEntradas = sc.nextInt();

        int numero = 0;

        for(int i = 0; i < numeroDeEntradas; i++){
            numero = sc.nextInt();
            if(numero%2==0){
                pares.add(numero);
            }else {
                impares.add(numero);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        for(Integer valor: pares){
            System.out.println(valor);
        }

        for(Integer valor: impares){
            System.out.println(valor);
        }

        sc.close();

    }

}