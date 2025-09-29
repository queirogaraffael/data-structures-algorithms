package problemsolving.others;

import java.util.ArrayList;
import java.util.List;

public class MaiorDiferencaArray {

    public static int maiorDiferenca(String valoresString){

        String[] valoresEmString = valoresString.split(",");

        if (valoresEmString.length < 2) return 0;

        List<Integer> valores = new ArrayList<>();

        for(String valor: valoresEmString){
            valores.add(Integer.parseInt(valor.trim()));
        }

        int maiorDiferenca = Integer.MIN_VALUE;

        for(int i = 1; i < valores.size(); i++){

            int diferenca = Math.abs(valores.get(i - 1) - valores.get(i));

            if( diferenca> maiorDiferenca){
                maiorDiferenca = diferenca;
            }

        }
        return maiorDiferenca;
    }

    public static void main(String[] args) {
        System.out.println(maiorDiferenca("10,3,5,1,8")); // Saída esperada: 7

    }
}
