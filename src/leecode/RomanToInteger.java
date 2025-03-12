package leecode;

public class RomanToInteger {
}
class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> romanNumerals = new HashMap<>();

        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int soma = 0;
        int ultimoValor = 0;

        for(int i = s.length() - 1; i >=0 ; i--){
            int valorAtual = romanNumerals.get(s.charAt(i));

            if(valorAtual < ultimoValor ){
                soma -= valorAtual;

            }else{
                soma += valorAtual;
                ultimoValor = valorAtual;
            }

        }

        return soma;

    }
}