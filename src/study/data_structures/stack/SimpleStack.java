package study.data_structures.stack;
import java.util.ArrayDeque;

public class SimpleStack {
    public static void main(String args[]) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Adiciona elementos a pilha
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Mostra a pilha
        System.out.println(stack);

        // Mostra o que esta no topo, ou seja, o ultimo adicionado.
        System.out.print(stack.peek());

        // Remove o elemento do topo
        System.out.println(stack.pop());

        // Stack atual
        System.out.println(stack);


        // push, peek, pop, isEmpty
    }}

