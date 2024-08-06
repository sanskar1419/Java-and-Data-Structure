package BSTUsingSortedArray;

import java.util.LinkedList;
import java.util.Queue;

import ReusableCode.BinaryNode;

public class BSTUsingSortedArray {
    public static BinaryNode<Integer> bstUsingSortedArray(int arr[], int si, int ei) {
        if (si > ei)
            return null;

        int mid = (ei + si) / 2;
        BinaryNode<Integer> root = new BinaryNode<Integer>(arr[mid]);

        root.left = bstUsingSortedArray(arr, si, mid - 1);
        root.right = bstUsingSortedArray(arr, mid + 1, ei);

        return root;
    }

    public static void print(BinaryNode<Integer> root) {
        if (root == null)
            return;

        Queue<BinaryNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode<Integer> currentUser = queue.poll();
            System.out.print(currentUser.data + " : ");

            if (currentUser.left != null) {
                System.out.print("L" + currentUser.left.data + ", ");
                queue.add(currentUser.left);
            }

            if (currentUser.right != null) {
                System.out.print("R" + currentUser.right.data);
                queue.add(currentUser.right);
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        BinaryNode<Integer> root = bstUsingSortedArray(arr, 0, arr.length - 1);
        print(root);
    }
}
