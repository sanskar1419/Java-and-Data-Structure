package BinaryTreeUsingPostAndInOrder;

import java.util.LinkedList;
import java.util.Queue;

import ReusableClass.BinaryNode;

public class BinaryTreeUsingPostAndInOrder {

    public static BinaryNode<Integer> buildTreeHelper(int[] postOrder, int[] inOrder, int postSI, int postEI, int inSI,
            int inEI) {
        if (postSI > postEI)
            return null;

        BinaryNode<Integer> root = new BinaryNode<Integer>(postOrder[postEI]);

        int i = inSI;
        while (i <= inEI) {
            if (inOrder[i] == root.data) {
                break;
            }
            i++;
        }

        int postLeftSI = postSI;
        int inLeftSI = inSI;
        int inLeftEI = i - 1;

        int postRightEI = postEI - 1;
        int inRightSI = i + 1;
        int inRightEI = inEI;

        int rightInOrderLength = inRightEI - inRightSI + 1;
        // int leftInOrderLength = inLeftEI - inLeftSI + 1;

        int postRightSI = postRightEI - rightInOrderLength + 1;
        int postLeftEI = postRightSI - 1;

        root.leftNode = buildTreeHelper(postOrder, inOrder, postLeftSI, postLeftEI, inLeftSI, inLeftEI);
        root.rightNode = buildTreeHelper(postOrder, inOrder, postRightSI, postRightEI, inRightSI, inRightEI);

        return root;
    }

    public static BinaryNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        BinaryNode<Integer> root = buildTreeHelper(postOrder, inOrder, 0, postOrder.length - 1, 0, inOrder.length - 1);
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
        int postOrder[] = { 4, 5, 2, 6, 7, 3, 1 };

        BinaryNode<Integer> root = buildTree(postOrder, inOrder);
        printLevelWise(root);
    }
}
