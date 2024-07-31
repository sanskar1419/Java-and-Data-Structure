package CreateAndDuplicateNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import ReusableClass.BinaryNode;

public class CreateAndDuplicateNode {
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

    public static void insertDuplicateNode(BinaryNode<Integer> root) {
        // Your code goes here
        if (root == null)
            return;

        insertDuplicateNode(root.leftNode);
        insertDuplicateNode(root.rightNode);

        BinaryNode<Integer> newNode = new BinaryNode<Integer>(root.data);
        newNode.leftNode = root.leftNode;
        root.leftNode = newNode;
    }

    public static void main(String args[]) {
        BinaryNode<Integer> root = input();
        printLevelWise(root);
        insertDuplicateNode(root);
        printLevelWise(root);
    }
}
