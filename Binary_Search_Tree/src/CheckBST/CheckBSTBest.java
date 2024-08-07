package CheckBST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import ReusableCode.BinaryNode;

public class CheckBSTBest {
    public static boolean checkBST(BinaryNode<Integer> root, int minRange, int maxRange) {
        if (root == null)
            return true;

        if (root.data < minRange || root.data > maxRange)
            return false;

        boolean isLeftBST = checkBST(root.left, minRange, root.data - 1);
        boolean isRightBST = checkBST(root.right, root.data, maxRange);

        return isLeftBST && isRightBST;
    }

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
                currentNode.left = lNode;
            }

            System.out.print("Enter the right node data of " + currentNode.data + " : ");
            int right = s.nextInt();
            if (right != -1) {
                BinaryNode<Integer> rNode = new BinaryNode<Integer>(right);
                queue.add(rNode);
                currentNode.right = rNode;
            }
        }

        return root;
    }

    public static void main(String args[]) {
        BinaryNode<Integer> root = input();
        System.out.println(checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
