package problemsolving.others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContarPalavrasSelecionadas {

    public static int[] contarPalavrasSelecionadas(String entrada){

        String[] entradaDividida = entrada.split("\n");
        String[] palavras = entradaDividida[0].split("\\W+"); // quebra em qualquer coisa que não seja numero ou letra
        String[] palavrasSelecionadas = entradaDividida[1].split(",");

        Map<String, Integer> palavrasFrequencia = new HashMap<>();

        int[] resultado = new int[palavrasSelecionadas.length];

        for(String palavra : palavras){
            palavrasFrequencia.put(palavra, palavrasFrequencia.getOrDefault(palavra, 0) + 1);
        }

        for(int i = 0; i < resultado.length; i++){
            resultado[i] = palavrasFrequencia.getOrDefault(palavrasSelecionadas[i], 0);
        }

        return resultado;

    }

    public static void main(String[] args) {
        String entrada = "java eh uma linguagem de programacao. java eh muito popular. java nao morreu!\njava,eh,muito,python";
        System.out.println(Arrays.toString(contarPalavrasSelecionadas(entrada))); // Saída esperada: [3, 2, 1, 0]
    }
}
