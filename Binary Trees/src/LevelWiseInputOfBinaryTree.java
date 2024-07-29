import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelWiseInputOfBinaryTree {
    public static BinaryNode<Integer> input() {

        System.out.print("Enter the root element : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n == -1) {
            return null;
        }

        BinaryNode<Integer> root = new BinaryNode<Integer>(n);
        Queue<BinaryNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode<Integer> currentNode = queue.poll();
            System.out.print("Enter the left node data of " + currentNode.data + " : ");
            int left = s.nextInt();
            if (left != -1) {
                BinaryNode<Integer> lNode = new BinaryNode<Integer>(left);
                queue.add(lNode);
                currentNode.leftNode = lNode;
            }

            System.out.print("Enter the right node data of " + currentNode.data + " : ");
            int right = s.nextInt();
            if (right != -1) {
                BinaryNode<Integer> rNode = new BinaryNode<Integer>(right);
                queue.add(rNode);
                currentNode.rightNode = rNode;
            }
        }

        return root;
    }

    public static void printBTRecursivelyDetailed(
            BinaryNode<Integer> root) {
        if (root == null)
            return;

        System.out.print(root.data + " : ");
        if (root.leftNode != null)
            System.out.print("L" + root.leftNode.data + ", ");
        if (root.rightNode != null)
            System.out.print("R" + root.rightNode.data);

        System.out.println();
        printBTRecursivelyDetailed(root.leftNode);
        printBTRecursivelyDetailed(root.rightNode);
    }

    public static void printLevelWise(BinaryNode<Integer> root) {
        if (root == null)
            return;

        Queue<BinaryNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode<Integer> currentNode = queue.poll();

            System.out.print(currentNode.data + " : ");
            if (currentNode.leftNode != null) {
                System.out.print("L" + currentNode.leftNode.data + ", ");
                queue.add(currentNode.leftNode);
            }

            if (currentNode.rightNode != null) {
                System.out.print("R" + currentNode.rightNode.data);
                queue.add(currentNode.rightNode);
            }

            System.out.println();

        }

    }

    public static void main(String args[]) {
        BinaryNode<Integer> root = input();
        printBTRecursivelyDetailed(root);

        System.out.println("Printing Level Wise ..................");
        printLevelWise(root);
    }
}
