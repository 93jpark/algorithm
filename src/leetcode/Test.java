package leetcode;


public class Test {
    public static void main(String[] args) {


        System.out.println(Ex_567.checkInclusion("ab","eidbaooo")+"\n");
        System.out.println(Ex_567.checkInclusion("ab","eidboaoo")+"\n");
        System.out.println(Ex_567.checkInclusion("ab","ab")+"\n");

        System.out.println(Ex_567.checkInclusion("hello","ooolleoooleh")+"\n");

        System.out.println(Ex_567.checkInclusion("abcdxabcde","abcdeabcdx")+"\n");


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