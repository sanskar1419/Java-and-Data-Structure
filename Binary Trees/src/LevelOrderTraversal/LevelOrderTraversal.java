package LevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

import ReusableClass.BinaryNode;

public class LevelOrderTraversal {
    public static void printLevelWise(BinaryNode<Integer> root) {
        // Your code goes here
        if (root == null)
            return;

        Queue<BinaryNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            BinaryNode<Integer> current = queue.poll();
            if (current == null) {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                System.out.print(current.data + " ");
                if (current.leftNode != null) {
                    queue.add(current.leftNode);
                }

                if (current.rightNode != null) {
                    queue.add(current.rightNode);
                }
            }

        }
    }
}
