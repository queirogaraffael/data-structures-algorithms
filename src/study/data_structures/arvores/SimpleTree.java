package study.data_structures.arvores;

class Tree {
    static class NoArvore {
        int valor;
        NoArvore esquerdo, direito;

        public NoArvore(int valor) {
            this.valor = valor;
            this.esquerdo = this.direito = null;
        }
    }

    static class ArvoreBinaria {
        NoArvore raiz;

        public ArvoreBinaria() {
            this.raiz = null;
        }

        public void inserir(int valor) {
            raiz = inserirRec(raiz, valor);
        }

        private NoArvore inserirRec(NoArvore no, int valor) {
            if (no == null) {
                return new NoArvore(valor);
            }

            if (valor < no.valor) {
                no.esquerdo = inserirRec(no.esquerdo, valor);
            } else {
                no.direito = inserirRec(no.direito, valor);
            }

            return no;
        }

        public void emOrdem() {
            emOrdemRec(raiz);
            System.out.println();
        }

        private void emOrdemRec(NoArvore no) {
            if (no != null) {
                emOrdemRec(no.esquerdo);
                System.out.print(no.valor + " ");
                emOrdemRec(no.direito);
            }
        }
    }
}

public class SimpleTree {
    public static void main(String[] args) {
        Tree.ArvoreBinaria arvore = new Tree.ArvoreBinaria();
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(2);
        arvore.inserir(4);
        arvore.inserir(6);
        arvore.inserir(8);

        System.out.println("Percorrendo a árvore em ordem:");
        arvore.emOrdem();
    }
}
