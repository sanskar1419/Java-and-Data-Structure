public class DoubleNode {
    Node<Integer> head;
    Node<Integer> tail;

    public DoubleNode() {
    }

    public DoubleNode(Node<Integer> head, Node<Integer> tail) {
        this.tail = tail;
        this.head = head;
    }
}
