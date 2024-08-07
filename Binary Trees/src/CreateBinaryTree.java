import java.util.Scanner;

import ReusableClass.BinaryNode;

public class CreateBinaryTree {
    public static Pair diameterOfBinaryTreeBetter(BinaryNode<Integer> root) {
        if (root == null)
            return new Pair(0, 0);

        Pair leftPair = diameterOfBinaryTreeBetter(root.leftNode);
        Pair rightPair = diameterOfBinaryTreeBetter(root.rightNode);

        int rootDiameter = leftPair.height + rightPair.height + 1;

        return new Pair(Math.max(leftPair.height, rightPair.height) + 1,
                Math.max(rootDiameter, Math.max(leftPair.diameter, rightPair.diameter)));
    }

    public static int diameterOfBinaryTree(BinaryNode<Integer> root) {
        if (root == null)
            return 0;

        int diameterAtRoot = heightOfTree(root.leftNode) + heightOfTree(root.rightNode) + 1;
        int diameterOnLeft = diameterOfBinaryTree(root.leftNode);
        int diameterOnRight = diameterOfBinaryTree(root.rightNode);

        return Math.max(diameterAtRoot, Math.max(diameterOnLeft, diameterOnRight));
    }

    public static BalancedTreeReturn isBalancedBetter(BinaryNode<Integer> root) {
        if (root == null) {
            return new BalancedTreeReturn(0, true);
        }

        BalancedTreeReturn leftOutput = isBalancedBetter(root.leftNode);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.rightNode);

        boolean isBalanced = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height - rightOutput.height) > 1)
            isBalanced = false;

        if (!leftOutput.isBalanced || !rightOutput.isBalanced)
            isBalanced = false;

        return new BalancedTreeReturn(height, isBalanced);

    }

    public static boolean isBalanced(BinaryNode<Integer> root) {
        if (root == null)
            return true;

        if (Math.abs(heightOfTree(root.leftNode) - heightOfTree(root.rightNode)) > 1)
            return false;

        return isBalanced(root.leftNode) && isBalanced(root.rightNode);
    }

    public static void mirrorBinaryTree(BinaryNode<Integer> root) {

        if (root == null)
            return;

        BinaryNode<Integer> temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp;

        mirrorBinaryTree(root.leftNode);
        mirrorBinaryTree(root.rightNode);

    }

    public static BinaryNode<Integer> removeLeafs(BinaryNode<Integer> root) {
        if (root == null)
            return null;

        if (root.leftNode == null && root.rightNode == null)
            return null;

        root.leftNode = removeLeafs(root.leftNode);
        root.rightNode = removeLeafs(root.rightNode);

        return root;
    }

    public static void printNodesWithoutSibling(BinaryNode<Integer> root) {
        // Your code goes here
        if (root == null)
            return;

        if (root.leftNode == null && root.rightNode == null)
            return;

        if (root.leftNode == null) {
            System.out.print(root.rightNode.data + " ");
        } else if (root.rightNode == null) {
            System.out.print(root.leftNode.data + " ");
        }

        printNodesWithoutSibling(root.leftNode);
        printNodesWithoutSibling(root.rightNode);
    }

    public static void convertToDepthTree(BinaryNode<Integer> root, int k) {
        if (root == null)
            return;

        root.data = k;
        convertToDepthTree(root.leftNode, k + 1);
        convertToDepthTree(root.rightNode, k + 1);

    }

    public static void printNodesInKDepth(BinaryNode<Integer> root, int k) {
        if (root == null)
            return;

        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }
        printNodesInKDepth(root.leftNode, k - 1);
        printNodesInKDepth(root.rightNode, k - 1);

    }

    public static int countLeafNode(BinaryNode<Integer> root) {
        if (root == null)
            return 0;

        if (root.leftNode == null && root.rightNode == null)
            return 1;

        int leafNodeLeft = countLeafNode(root.leftNode);
        int leafNodeRight = countLeafNode(root.rightNode);

        return leafNodeLeft + leafNodeRight;
    }

    public static int heightOfTree(BinaryNode<Integer> root) {
        if (root == null)
            return 0;

        return 1 + Math.max(heightOfTree(root.leftNode), heightOfTree(root.rightNode));
    }

    public static int countNodesGreaterThanX(BinaryNode<Integer> root, int X) {
        if (root == null)
            return 0;
        int leftNodes = countNodesGreaterThanX(root.leftNode, X);
        int rightNodes = countNodesGreaterThanX(root.rightNode, X);

        return (root.data > X ? 1 : 0) + leftNodes + rightNodes;
    }

    public static int maxNode(BinaryNode<Integer> root) {
        if (root == null)
            return 0;
        int leftMax = maxNode(root.leftNode);
        int rightMax = maxNode(root.rightNode);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void inOrderTraversal(BinaryNode<Integer> root) {
        if (root == null)
            return;

        inOrderTraversal(root.leftNode);
        System.out.print(root.data + " ");
        inOrderTraversal(root.rightNode);

    }

    public static void postOrderTraversal(BinaryNode<Integer> root) {
        if (root == null)
            return;

        postOrderTraversal(root.leftNode);
        postOrderTraversal(root.rightNode);
        System.out.print(root.data + " ");
    }

    public static void preOrderTraversal(BinaryNode<Integer> root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrderTraversal(root.leftNode);
        preOrderTraversal(root.rightNode);
    }

    public static int nodesTotalSum(BinaryNode<Integer> root) {
        if (root == null)
            return 0;
        int numberOfLeftNodes = nodesTotalSum(root.leftNode);
        int numberOfRightNodes = nodesTotalSum(root.rightNode);

        return root.data + numberOfLeftNodes + numberOfRightNodes;
    }

    public static int numberOfNodes(BinaryNode<Integer> root) {
        if (root == null)
            return 0;

        int leftSum = numberOfNodes(root.leftNode);
        int rightSum = numberOfNodes(root.rightNode);

        return 1 + leftSum + rightSum;

    }

    public static BinaryNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.print("Enter the root element : ");
        } else {
            if (isLeft)
                System.out.print("Enter the left node of " + parentData + " : ");
            else
                System.out.print("Enter the right node of " + parentData + " : ");
        }
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1)
            return null;

        BinaryNode<Integer> root = new BinaryNode<>(rootData);
        root.leftNode = takeInputBetter(false, rootData, true);
        root.rightNode = takeInputBetter(false, rootData, false);

        return root;
    }

    public static BinaryNode<Integer> takeInput() {
        System.out.print("Enter the root element : ");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1)
            return null;

        BinaryNode<Integer> root = new BinaryNode<>(rootData);
        root.leftNode = takeInput();
        root.rightNode = takeInput();

        return root;
    }

    public static void printBTRecursivelyDetailed(
            BinaryNode<Integer> root) {
        if (root == null)
            return;

        System.out.print(root.data + " : ");
        if (root.leftNode != null)
            System.out.print("L" + root.leftNode.data + ", ");
        if (root.rightNode != null)
            System.out.print("R" + root.rightNode.data);

        System.out.println();
        printBTRecursivelyDetailed(root.leftNode);
        printBTRecursivelyDetailed(root.rightNode);
    }

    public static void printBTRecursively(BinaryNode<Integer> root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        printBTRecursively(root.leftNode);
        printBTRecursively(root.rightNode);
    }

    public static void main(String args[]) {
        BinaryNode<Integer> root = takeInputBetter(true, 0, true);
        BalancedTreeReturn result = isBalancedBetter(root);
        System.out.println(result.height + " " + result.isBalanced);

        // System.out.println(isBalanced(root));
        // printBTRecursivelyDetailed(root);
        // mirrorBinaryTree(root);
        // System.out.println("Mirror Tree : ");
        // printBTRecursivelyDetailed(root);
        // root = removeLeafs(root);
        // printBTRecursivelyDetailed(root);

        // preOrderTraversal(root);
        // System.out.println();
        // postOrderTraversal(root);
        // System.out.println();
        // inOrderTraversal(root);

        // BinaryNode<Integer> firstNode = new BinaryNode<Integer>(10);
        // BinaryNode<Integer> secondNode = new BinaryNode<Integer>(20);
        // BinaryNode<Integer> thirdNode = new BinaryNode<Integer>(30);
        // BinaryNode<Integer> fourthNode = new BinaryNode<Integer>(40);

        // firstNode.leftNode = secondNode;
        // firstNode.rightNode = thirdNode;
        // thirdNode.leftNode = fourthNode;

        // BinaryNode<Integer> root = takeInputBetter(true, 0, true);
        // printBTRecursivelyDetailed(root);
        // System.out.println("Number of node in the binary tree are : " +
        // numberOfNodes(root));
        // System.out.println("Total Sum of nodes is : " + nodesTotalSum(root));

    }
}
