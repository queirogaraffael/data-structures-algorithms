package problemsolving.others;

import java.util.HashMap;
import java.util.Map;

public class NaoRepete {

    public static int contarUnicos(int[] nums) {

        Map<Integer, Integer> valoresRepeticao = new HashMap<>();

        int quantidadeNaoRepetidos = 0;

        for (int numero : nums) {
            valoresRepeticao.put(numero, valoresRepeticao.getOrDefault(numero,0) + 1);
        }

        for (Integer chave : valoresRepeticao.keySet()) {
            if (valoresRepeticao.get(chave) == 1) {
                quantidadeNaoRepetidos += 1;
            }
        }

        return quantidadeNaoRepetidos;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 3, 1, 2};
        System.out.println(contarUnicos(nums)); // Saída esperada: 2
    }
}
