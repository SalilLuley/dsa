package LinkedList;

public class LinkedListUse {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        node1.next = node2;
        System.out.println(node1.data);
        System.out.println(node1.next);

    }
}
