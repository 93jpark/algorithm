package Programmers;

import java.util.*;

public class Ex_12977 {
    static HashSet<Integer> set = new HashSet<>();

    public static int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++) {

            for(int j=i+1; j<nums.length-1; j++) {

                for(int k=j+1; k<nums.length; k++) {

                    //System.out.printf("%d %d %d\t", i,j,k);

                    if(isPrime(nums[i], nums[j], nums[k])) {
                        answer++;
                    }

                }

            }

        }


        return answer;
    }

    public static boolean isPrime(int i, int j, int k) {
        int sum = i + j + k;
        //System.out.println(sum);
        if(set.contains(sum)) {
            return false;
        } else {
            boolean flag = true;
            for(int num=2; num<sum; num++) {
                if(sum % num == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));

        System.out.println(solution(new int[]{1,2,7,6,4}));
    }
}
