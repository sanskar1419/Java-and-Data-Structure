package CheckBST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import ReusableCode.BinaryNode;
import ReusableCode.IsBSTReturns;

public class CheckBSTBetter {
    public static IsBSTReturns checkBST(BinaryNode<Integer> root) {
        if (root == null)
            return new IsBSTReturns(true, Integer.MAX_VALUE, Integer.MIN_VALUE);

        IsBSTReturns isLeftBST = checkBST(root.left);
        IsBSTReturns isRightBST = checkBST(root.right);

        int min = Math.min(root.data, Math.min(isLeftBST.min, isRightBST.min));
        int max = Math.max(root.data, Math.max(isLeftBST.max, isRightBST.max));

        boolean isBST = true;
        if (isLeftBST.max >= root.data)
            isBST = false;

        if (isRightBST.min < root.data)
            isBST = false;

        if (!isLeftBST.isBST || !isRightBST.isBST)
            isBST = false;

        return new IsBSTReturns(isBST, min, max);

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
        IsBSTReturns isBST = checkBST(root);
        System.out.println(isBST.isBST);
    }
}
