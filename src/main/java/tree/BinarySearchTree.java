package tree;

public class BinarySearchTree {

    private void search(TreeNode root, int x) {
        if (root == null) {
            System.out.println("search failed");
            return;
        }
        if (root.val == x) {
            System.out.println("find it");
        } else if (x < root.val) {
            search(root.left, x);
        } else {
            search(root.right, x);
        }
    }

    private void insert(TreeNode root, int x) {
        if (root.left == null) {
            root.left = new TreeNode(x);
            return;
        }
        if (root.right == null) {
            root.right = new TreeNode(x);
            return;
        }
        if (x == root.val) {
            return;
        } else if (x < root.val) {
            insert(root.left, x);
        } else {
            insert(root.right, x);
        }
    }

    private TreeNode findMax(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    private void deleteNode(TreeNode root, int x) {
        if (root == null) return;
        if (root.val == x) {    // delete it
            if (root.left == null && root.right == null) { // leaf node, delete directly

            }
        } else if (root.val < x) {
            deleteNode(root.right, x);
        } else {
            deleteNode(root.left, x);
        }
    }
}
