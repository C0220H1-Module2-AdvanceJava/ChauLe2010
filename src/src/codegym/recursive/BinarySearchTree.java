package codegym.recursive;

public class BinarySearchTree {
    public static TreeNode insertValue(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (root.getData() > key) {
            root.setLeft(insertValue(root.getLeft(), key));
        }
        else {
            root.setRight(insertValue(root.getRight(), key));
        }
        return root;
    }

    public static void searchNode(TreeNode root, int key, TreeNode parent) {
        if (root == null) {
            System.out.print("Key Not found");
            return;
        }
        if (root.getData() == key) {
            if (parent == null) {
                System.out.print("The Node with key " + key + " is root node");
            }
            else if (parent.getData() > key) {
                System.out.print("Given key if left node of node with key " + parent.getData());
            }
            else {
                System.out.print("Given key is right node of node wiht key " + parent.getData());
            }
            return;
        }
        if (root.getData() > key) {
            searchNode(root.getLeft(), key, root);
        }
        else {
            searchNode(root.getRight(), key, root);
        }
    }
}
