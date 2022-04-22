package leetcode;

import javax.swing.tree.TreeNode;

public class Ex_2236 {
    public static boolean checkTree(TreeNode root) {
        return (root.left.val + root.right.val) == root.val;
    }
}
