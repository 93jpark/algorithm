package leetcode;
import java.util.*;
public class Ex_113 {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        l2.addAll(l1);

        l1.stream().mapToInt(a -> a).sum();

        System.out.println(l1);
        System.out.println(l2);
    }
    public static List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {



        if(root == null) return lists;

        recursive(root, new ArrayList<>());


        return lists;
    }

    public static void recursive(TreeNode node, List<Integer> list) {
        if(node.left == null && node.right == null) {
            list.add(node.val);
            lists.add(list);
        } else {
            list.add(node.val);
            if(node.left != null) {
                List<Integer> newList = new ArrayList<>();
                newList.addAll(list);
                newList.add(node.left.val);
                recursive(node.left, newList);
            }
            if(node.right != null) {
                List<Integer> newList = new ArrayList<>();
                newList.addAll(list);
                newList.add(node.right.val);
                recursive(node.right, newList);
            }
        }
    }


}
