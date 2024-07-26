import java.util.Scanner;

public class CreateBinaryTree {

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
        preOrderTraversal(root);

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
