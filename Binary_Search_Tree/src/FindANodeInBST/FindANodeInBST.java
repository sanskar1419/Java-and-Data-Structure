package FindANodeInBST;

import ReusableCode.BinaryNode;

public class FindANodeInBST {
    public static boolean searchInBST(BinaryNode<Integer> root, int k) {
        if (root == null)
            return false;

        if (root.data == k) {
            return true;
        } else if (root.data > k) {
            return searchInBST(root.left, k);
        } else {
            return searchInBST(root.right, k);
        }
    }
}