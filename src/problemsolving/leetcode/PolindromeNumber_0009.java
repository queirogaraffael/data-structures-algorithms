package problemsSolving.leetcode;

// Dado um número inteiro x, retorne verdadeiro se x for um palíndromo, e falso caso contrário.
//
// Exemplo 1:
// Entrada: x = 121
// Saída: verdadeiro
// Explicação: 121 é lido da mesma forma da esquerda para a direita e da direita para a esquerda.
//
// Exemplo 2:
// Entrada: x = -121
// Saída: falso
// Explicação: Da esquerda para a direita, lê-se -121. Da direita para a esquerda, torna-se 121-. Portanto, não é um palíndromo.
//
// Exemplo 3:
// Entrada: x = 10
// Saída: falso
// Explicação: Lê-se 01 da direita para a esquerda. Portanto, não é um palíndromo.
//
// Restrições:
// -231 <= x <= 231 - 1


public class PolindromeNumber_0009 {
    class Solution {
        public boolean isPalindrome(int x) {

            if (x < 0){
                return false;
            }

            Long numeroInvertido = Long.parseLong(new StringBuilder(String.valueOf(x)).reverse().toString());

            if(numeroInvertido == x){
                return true;
            }

            return false;

        }
    }
}
