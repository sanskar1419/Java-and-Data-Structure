public class CreateBinaryTree {
    public static void printBTRecursively(BinaryNode<Integer> root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        printBTRecursively(root.leftNode);
        printBTRecursively(root.rightNode);
    }

    public static void main(String args[]) {
        BinaryNode<Integer> firstNode = new BinaryNode<Integer>(10);
        BinaryNode<Integer> secondNode = new BinaryNode<Integer>(20);
        BinaryNode<Integer> thirdNode = new BinaryNode<Integer>(30);
        BinaryNode<Integer> fourthNode = new BinaryNode<Integer>(40);

        firstNode.leftNode = secondNode;
        firstNode.rightNode = thirdNode;
        thirdNode.leftNode = fourthNode;

        printBTRecursively(firstNode);
    }
}
