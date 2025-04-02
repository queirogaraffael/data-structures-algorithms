package study.algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }
}

public class OrdenacaoComparator {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Carlos", 25));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Bruno", 28));

        // Ordena pela idade (crescente)
        Collections.sort(pessoas, Comparator.comparingInt(p -> p.idade));

        System.out.println(pessoas);
    }
}
