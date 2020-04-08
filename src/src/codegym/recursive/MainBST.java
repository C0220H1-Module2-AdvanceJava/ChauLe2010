package codegym.recursive;

public class MainBST {
    public static void main(String[] args) {
        TreeNode root = null;
        int[] keys = {60, 55, 100, 45, 57, 67, 107, 50, 59, 101, 109};
        for (int key : keys) {
            root = BinarySearchTree.insertValue(root, key);
        }
        BinarySearchTree.searchNode(root, 45, null);
        System.out.println();
    }
}
