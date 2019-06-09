package Array;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0 || inorder.length != postorder.length) return null;
        return buildTree(inorder, postorder, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int in_start, int in_end, int post_start){
        if (post_start < 0 || in_start < in_end) return null;
        TreeNode node = new TreeNode(postorder[post_start]);
        int index = in_start;
        while (index >= in_end) {
            if (inorder[index] == postorder[post_start]) break;
            index--;
        }
        node.left = buildTree(inorder, postorder, index - 1, in_end, post_start - (in_start - index) - 1);
        node.right = buildTree(inorder, postorder, in_start, index + 1, post_start - 1);
        return node;
    }
}
