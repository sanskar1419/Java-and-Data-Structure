package PathSumRootToLeaf;

import ReusableClass.BinaryNode;

public class PathSumRootToLeaf {
    public static void helper(BinaryNode<Integer> root, int k, String path, int currentSum) {
        if (root == null)
            return;

        if (root.leftNode == null && root.rightNode == null) {
            currentSum += root.data;
            if (currentSum == k) {
                System.out.println(path + root.data + " ");
            }

            return;
        }

        helper(root.leftNode, k, (path + root.data + " "), currentSum + root.data);
        helper(root.rightNode, k, (path + root.data + " "), currentSum + root.data);
    }

    public static void rootToLeafPathsSumToK(BinaryNode<Integer> root, int k) {
        // Your code goes here
        helper(root, k, "", 0);
    }

}
