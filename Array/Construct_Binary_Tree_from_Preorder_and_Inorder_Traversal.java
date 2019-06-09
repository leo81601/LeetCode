package Array;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) return null;
        return buildTree(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int pre_start, int in_start, int in_end){
        if (pre_start > preorder.length || in_start > in_end) return null;
        TreeNode node = new TreeNode(preorder[pre_start]);
        int index = in_start;
        while (index <= in_end) {
            if (inorder[index] == preorder[pre_start]) break;
            index++;
        }
        node.left = buildTree(preorder, inorder, pre_start + 1, in_start, index - 1);
        node.right = buildTree(preorder, inorder, pre_start + (index - in_start) + 1, index + 1, in_end);
        return node;
    }
}
