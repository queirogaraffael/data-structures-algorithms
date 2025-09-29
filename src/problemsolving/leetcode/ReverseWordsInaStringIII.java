package problemsSolving.leetcode;

public class ReverseWordsInaStringIII {
    class Solution {
        public String reverseWords(String s) {
            String output = "";

            String[] palavras = s.split(" ");

            for(int i = 0; i < palavras.length; i++){

                String palavraInvertida = "";
                String[] palavra = palavras[i].split("");

                for(int j = palavra.length - 1 ; j >= 0 ; j--){
                    palavraInvertida += palavra[j];
                }

                if(i != 0){
                    output += " ";
                }

                output += palavraInvertida;
            }

            return output;
        }
    }
}
