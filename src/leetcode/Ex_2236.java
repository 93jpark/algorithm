package leetcode;


public class Ex_2236 {
    public static boolean checkTree(TreeNode root) {
        return (root.left.val + root.right.val) == root.val;
    }
}

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
}
