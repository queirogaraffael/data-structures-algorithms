package study.data_structures.queue;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleExample {
    public static void main(String args[]) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Mostra a fila
        System.out.println(queue);

        // Mostro o primeiro adicionado
        System.out.println(queue.peek());

        // Remove FIFO
        System.out.println(queue.poll());

        // Fila atual
        System.out.println(queue);


        // offer, peek, poll, isEmpty
    }
}