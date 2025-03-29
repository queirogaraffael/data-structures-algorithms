package problems_solving.beecrowd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Seu professor de português não para de trazer coisas novas para a sala, e hoje não foi diferente.
Existe uma cidade, segundo seu professor, onde as pessoas levam muito a sério a forma como elas se comunicam.
Em especial, quando duas pessoas estão conversando, elas pensam muito nas frases antes de dizê-las,
de forma a garantir que tal frase seja uma “frase completa”, ou talvez uma “frase quase completa”.

Considerando o nosso alfabeto de 26 letras, uma frase é dita “completa” quando ela contém todas as
letras do alfabeto contidas nela. De modo semelhante, uma frase é dita “quase completa” se ela não
é completa, porém contém ao menos metade das letras do alfabeto contidas nela.
Quando uma frase não é “completa” e nem “quase completa”, ela é dita “mal elaborada”.

Seu professor lhe deu uma tarefa muito difícil: dadas várias frases trocadas entre vários habitantes
da cidade citada, diga em qual das categorias acima a frase se encaixa.

Entrada:
A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir.

Cada caso de teste contém uma linha, contendo letras minúsculas, espaços em branco e/ou vírgulas.
O número de caracteres de cada linha é no mínimo 3 e no máximo 1000, contando com os espaços.

Saída:
Para cada caso de teste, imprima uma linha contendo uma das seguintes frases:
“frase completa”, quando a frase é considerada completa;
“frase quase completa”, quando a frase não é completa, mas é considerada quase completa;
ou “frase mal elaborada”, quando ela não é completa e nem quase completa.

Exemplo de Entrada:
2
ola, como voce esta hoje
hoje fui na feira, e comprei banana, melao e abacates

Exemplo de Saída:
frase mal elaborada
frase quase completa
*/


/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class FraseCompleta {

    public static void main(String[] args) throws IOException {

        List<String> alfabeto = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        );

        List<String> resultado = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        for(int i = 0; i < n; i++){
            String frase = scanner.nextLine();
            resultado.add(avaliaFrase(alfabeto, frase));
        }

        for(int i = 0; i < resultado.size(); i++){
            System.out.println(resultado.get(i));
        }

        scanner.close();

    }

    public static String avaliaFrase(List<String> alfabeto, String frase){

        int quantidade = 0;

        for(int i = 0; i < alfabeto.size(); i++){
            if(frase.contains(alfabeto.get(i))){
                quantidade += 1;
            }
        }

        if(quantidade == alfabeto.size()){
            return "frase completa";
        }else if(quantidade >= alfabeto.size()/2){
            return "frase quase completa";
        }else{
            return "frase mal elaborada";
        }

    }

}