package BinaryTreeUsingPreAndInOrder;

import java.util.LinkedList;
import java.util.Queue;

import ReusableClass.BinaryNode;

public class BinaryTreeUsingPreAndInOrder {

    public static BinaryNode<Integer> buildTreeHelper(int[] preOrder, int[] inOrder, int preSI, int preEI, int inSI,
            int inEI) {
        if (preSI > preEI)
            return null;

        BinaryNode<Integer> root = new BinaryNode<Integer>(preOrder[preSI]);

        int i = inSI;
        while (i <= inEI) {
            if (inOrder[i] == root.data) {
                break;
            }
            i++;
        }

        int preLeftSI = preSI + 1;
        int inLeftSI = inSI;
        int inLeftEI = i - 1;

        int preRightEI = preEI;
        int inRightSI = i + 1;
        int inRightEI = inEI;

        int rightInOrderLength = inRightEI - inRightSI + 1;
        // int leftInOrderLength = inLeftEI - inLeftSI + 1;

        int preRightSI = preRightEI - rightInOrderLength + 1;
        int preLeftEI = preRightSI - 1;

        root.leftNode = buildTreeHelper(preOrder, inOrder, preLeftSI, preLeftEI, inLeftSI, inLeftEI);
        root.rightNode = buildTreeHelper(preOrder, inOrder, preRightSI, preRightEI, inRightSI, inRightEI);

        return root;
    }

    public static BinaryNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        BinaryNode<Integer> root = buildTreeHelper(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
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

    public static void main(String[] args) {
        int inOrder[] = { 4, 2, 5, 1, 6, 3, 7 };
        int preOrder[] = { 1, 2, 4, 5, 3, 6, 7 };

        BinaryNode<Integer> root = buildTree(preOrder, inOrder);
        printLevelWise(root);
    }
}
