package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree2 {

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
     * 先序遍历非递归实现
     * @param root root
     */
    private void preOrderWithStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    private void preOrderWithStack1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                System.out.println(node.val);
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                node = node.right;
            }
        }
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

    private void inOrderWithStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else  {
                node = stack.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }
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

    private void postOrderWithStack1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                output.push(node);
                node = node.right;
            } else {
                node = stack.pop();
                node = node.left;
            }
        }
        while (!output.isEmpty()) {
            System.out.println(output.pop().val);
        }
    }

    private void postOrderWithStack2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root, prev = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tmp = stack.peek().right;
                if (tmp == null || tmp == prev) {
                    node = stack.pop();
                    System.out.println(node.val);
                    prev = node;
                    node = null;
                } else {
                    node = tmp;
                }

            }
        }
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
