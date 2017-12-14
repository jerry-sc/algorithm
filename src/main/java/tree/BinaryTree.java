package tree;

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
     * 二叉树结点的插入
     *
     * @param root root node
     * @param x val
     */
    public void insert(TreeNode root, int x) {

    }


}
