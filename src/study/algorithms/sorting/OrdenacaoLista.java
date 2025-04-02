package study.algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoLista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Bruno");

        // Ordena alfabeticamente
        Collections.sort(nomes);

        System.out.println(nomes);
    }
}
