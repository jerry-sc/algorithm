package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    /**
     * search
     *
     * @param root root node
     * @param x old value
     * @param newData new value
     */
    public void search(TreeNode root, int x, int newData) {
        if (root == null)
            return;
        if (root.val == x)
            root.val = newData;
        search(root.left, x, newData);
        search(root.right, x, newData);
    }

    /**
     * 二叉树结点的插入, 二叉树节点插入插入位置就是数据域在二叉树中查找失败的位置
     *
     * @param root root node
     * @param x val
     */
    public void insert(TreeNode root, int x) {
        if (root.left == null) {
            root.left = new TreeNode(x);
            return;
        }
        if (root.right == null) {
            root.right = new TreeNode(x);
        }
//        if (由二叉树的性质，决定插在左子树还是有子树) {
//            insert(root.left, x);
//        } else {
//            insert(root.right, x);
//        }
    }

    /**
     * 先序遍历
     *
     * @param root root node
     */
    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * 中序遍历
     *
     * @param root root node
     */
    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    /**
     * 后序遍历
     *
     * @param root root node
     */
    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    /**
     * 层次遍历
     *
     * @param root root node
     */
    private void layerOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
    }
}
