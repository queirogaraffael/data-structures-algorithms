package study.datastructures.grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleGraphic {
    static class Grafo {
        private final Map<String, List<String>> adjacencia = new HashMap<>();

        public void adicionarVertice(String vertice) {
            adjacencia.putIfAbsent(vertice, new ArrayList<>());
        }

        public void adicionarAresta(String origem, String destino) {
            adjacencia.putIfAbsent(origem, new ArrayList<>());
            adjacencia.putIfAbsent(destino, new ArrayList<>());
            adjacencia.get(origem).add(destino);
            adjacencia.get(destino).add(origem);
        }

        public void mostrarGrafo() {
            for (var entrada : adjacencia.entrySet()) {
                System.out.println(entrada.getKey() + " -> " + entrada.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");

        grafo.adicionarAresta("A", "B");
        grafo.adicionarAresta("A", "C");
        grafo.adicionarAresta("B", "D");
        grafo.adicionarAresta("C", "D");

        System.out.println("Representação do grafo:");
        grafo.mostrarGrafo();
    }
}
