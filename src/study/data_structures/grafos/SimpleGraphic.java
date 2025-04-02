package study.data_structures.grafos;
import java.util.*;

public class SimpleGraphic {
    static class Grafo {
        private Map<String, List<String>> adjacencia;

        public Grafo() {
            this.adjacencia = new HashMap<>();
        }

        public void adicionarVertice(String vertice) {
            adjacencia.putIfAbsent(vertice, new ArrayList<>());
        }

        // não direcionado
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
}

class Main {
    public static void main(String[] args) {
        SimpleGraphic.Grafo grafo = new SimpleGraphic.Grafo();
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
