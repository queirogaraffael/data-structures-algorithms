package problemsolving.others;

import java.util.HashSet;
import java.util.Set;

public class SomarElementosComuns {

    public static int somarElementosComuns(String valores){

        int soma = 0;

        String[] linhas = valores.split("\n");

        String[] linha1 = linhas[0].split(",");
        String[] linha2 = linhas[1].split(",");

        Set<Integer> lista1 = new HashSet<>();
        Set<Integer> lista2 = new HashSet<>();

        for(String valor : linha1){
            lista1.add(Integer.parseInt(valor));
        }

        for(String valor: linha2){
            lista2.add(Integer.parseInt(valor));
        }

        for(Integer valor: lista1){
            if(lista2.contains(valor)){
                soma += valor;
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        String entrada = "1,2,3,4,5,6\n3,4,5,6,7";
        System.out.println(somarElementosComuns(entrada)); // Saída esperada: 18
    }
}
