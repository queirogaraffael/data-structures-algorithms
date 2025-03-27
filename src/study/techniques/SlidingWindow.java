package study.techniques;
import java.util.HashMap;
import java.util.Map;

/*
Dado uma string s, retorne o comprimento máximo de uma substring que contenha no máximo duas ocorrências de cada caractere.

Exemplo 1:

Entrada: s = "bcbbbcba"
Saída: 4

Explicação:
A seguinte substring tem comprimento 4 e contém no máximo duas ocorrências de cada caractere: "bcbbbcba".

Exemplo 2:

Entrada: s = "aaaa"
Saída: 2

Explicação:
A seguinte substring tem comprimento 2 e contém no máximo duas ocorrências de cada caractere: "aaaa".

Restrições:

    - 2 <= s.length <= 100
    - s consiste apenas de letras minúsculas do alfabeto inglês.
*/


public class SlidingWindow {
    public int maximumLengthSubstring(String s) {
        int l = 0, r = 0, maxLen = 1;
        Map<Character, Integer> counter = new HashMap<>();

        counter.put(s.charAt(0), 1);

        while (r < s.length() - 1) {
            r++;
            counter.put(s.charAt(r), counter.getOrDefault(s.charAt(r), 0) + 1);

            while (counter.get(s.charAt(r)) == 3) {
                counter.put(s.charAt(l), counter.get(s.charAt(l)) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        SlidingWindow sol = new SlidingWindow();
        String s = "abcabcbb";
        System.out.println("Comprimento máximo do substring: " + sol.maximumLengthSubstring(s));
    }
}
