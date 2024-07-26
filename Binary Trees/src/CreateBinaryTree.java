public class CreateBinaryTree {

    public static void main(String args[]) {
        BinaryNode<Integer> firstNode = new BinaryNode<Integer>(10);
        BinaryNode<Integer> secondNode = new BinaryNode<Integer>(20);
        BinaryNode<Integer> thirdNode = new BinaryNode<Integer>(30);
        BinaryNode<Integer> fourthNode = new BinaryNode<Integer>(30);

        firstNode.leftNode = secondNode;
        firstNode.rightNode = thirdNode;
        thirdNode.leftNode = fourthNode;
    }
}
