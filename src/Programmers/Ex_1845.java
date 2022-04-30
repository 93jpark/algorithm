package Programmers;

import java.util.HashSet;

/**
 * 폰켓몬
 */
public class Ex_1845 {

    public static int solution(int[] nums) {

        int max = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for(int i: nums) {
            set.add(i);
        }

        if(set.size() > max) {
            return max;
        } else {
            return set.size();
        }

    }

    public static void main(String[] args) {

        int[] nums = {3,1,2,3};
        System.out.println(solution(nums)); // 2

        nums = new int[] {3,3,3,2,2,4};
        System.out.println(solution(nums)); // 3

        nums = new int[] {3,3,3,2,2,2};
        System.out.println(solution(nums)); // 2

    }
}
