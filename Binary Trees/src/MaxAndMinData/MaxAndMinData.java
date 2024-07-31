package MaxAndMinData;

import ReusableClass.BinaryNode;
import ReusableClass.Pair;

public class MaxAndMinData {
    public static Pair<Integer, Integer> getMinAndMax(BinaryNode<Integer> root) {
        // Your code goes here

        if (root == null)
            return new Pair<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);

        Pair<Integer, Integer> leftPair = getMinAndMax(root.leftNode);
        Pair<Integer, Integer> rightPair = getMinAndMax(root.rightNode);

        int max = Math.max(root.data, Math.max(leftPair.maximum, rightPair.maximum));
        int min = Math.min(root.data, Math.min(leftPair.minimum, rightPair.minimum));

        return new Pair<Integer, Integer>(min, max);
    }

    public static void main(String args[]) {
    }
}
