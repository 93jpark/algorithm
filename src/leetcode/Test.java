package leetcode;


import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        //System.out.println(Ex_733.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2));
        //System.out.println(Ex_733.floodFill(new int[][]{{0,0,0},{0,0,0}}, 0, 0, 2));
        //System.out.println(Ex_733.floodFill(new int[][]{{0,0,0},{0,1,1}}, 1, 1, 1));

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(4);
        System.out.println(stack); // 1 7 8 9 4
        System.out.println(stack.peek()); // 4

        System.out.println(stack.search(9));
        System.out.println(stack.search(1));
        System.out.println(stack.indexOf(9));
        System.out.println(stack.remove(3));
        System.out.println(stack);



    }

    public int climbStairs(int n) {
        int[] memo = new int[n];

        memo[0] = 1;

        for(int i = 1; i <= n; i++) {

        }

        return 0;
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {this.val = val;};
    ListNode(int val, ListNode next) {this.val = val; this.next = next;};
}