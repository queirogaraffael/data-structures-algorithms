package problems_solving.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists0021 {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> valores = new ArrayList<>();

        for (ListNode nodeAtual = list1; nodeAtual != null; nodeAtual = nodeAtual.next) {
            valores.add(nodeAtual.val);
        }

        for (ListNode nodeAtual = list2; nodeAtual != null; nodeAtual = nodeAtual.next) {
            valores.add(nodeAtual.val);
        }

        valores.sort(Integer::compareTo);

        ListNode resultado = new ListNode();
        ListNode nodeAtual = resultado;


        for (int valor : valores) {
            nodeAtual.next = new ListNode(valor);
            nodeAtual = nodeAtual.next;
        }

        return resultado.next;
    }

}
