package Trees;

public class Traversals {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
//        Treenode(int value) {
//            this.value = value;
//        }
    }

    public void preorder(TreeNode root) {
        if (root == null) return;

        // Visit the node by printing the TreeNode value
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.value);
    }
}
