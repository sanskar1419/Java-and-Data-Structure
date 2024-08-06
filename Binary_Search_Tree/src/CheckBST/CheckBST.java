package CheckBST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import ReusableCode.BinaryNode;

public class CheckBST {
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

    public static int Maximum(BinaryNode<Integer> root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int leftMax = Maximum(root.left);
        int rightMax = Maximum(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static int Minimum(BinaryNode<Integer> root) {
        if (root == null)
            return Integer.MAX_VALUE;

        int leftMin = Minimum(root.left);
        int rightMin = Minimum(root.right);

        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static boolean checkBST(BinaryNode<Integer> root) {

        if (root == null)
            return true;

        int leftMax = Maximum(root.left);
        if (leftMax >= root.data) {
            return false;
        }
        int rightMin = Minimum(root.right);
        if (rightMin < root.data) {
            return false;
        }

        boolean isLeftBST = checkBST(root.left);
        boolean isRightBST = checkBST(root.right);

        return isLeftBST && isRightBST;
    }

    public static void main(String args[]) {
        BinaryNode<Integer> root = input();
        System.out.println(checkBST(root));

    }
}
