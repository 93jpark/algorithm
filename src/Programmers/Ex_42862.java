package Programmers;

import java.util.*;

public class Ex_42862 {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        LinkedList<Integer> list = new LinkedList<>();

        TreeSet<Integer> reserveSet = new TreeSet<>(); // students who has one
        TreeSet<Integer> lostSet = new TreeSet<>();


        for(int i : lost) {
            lostSet.add(i);
        }

        for(int i : reserve) {
            if(lostSet.contains(i)) {
                lostSet.remove(i);
            } else {
                reserveSet.add(i);
            }

        }

        System.out.println("lost:"+lostSet);
        System.out.println("reserve:"+reserveSet);

        for(int i=1; i<=n; i++) {
            if(lostSet.contains(i)) {
                answer--;
                /*
                if(reserveSet.contains(i) && lostSet.contains(i)) {
                    answer++;
                    reserveSet.remove(i);
                    lostSet.remove(i);
                    continue;
                }

                 */


                if(reserveSet.contains(i-1)) {
                    answer++;
                    reserveSet.remove(i-1);
                    continue;
                } else if(reserveSet.contains(i+1)) {
                    answer++;
                    reserveSet.remove(i+1);
                    continue;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        /*
            n	lost	reserve	    return
            5	[2, 4]	[1, 3, 5]	5
            5	[2, 4]	[3]     	4
            3	[3]	    [1]	        2
         */
        System.out.println(solution(5, new int[]{2,4}, new int[]{1,3,5})); // 5
        System.out.println(solution(5, new int[]{2,4}, new int[]{3})); // 4
        System.out.println(solution(3, new int[]{3}, new int[]{1})); // 2
        System.out.println(solution(5, new int[]{1,2,4}, new int[]{2,4,5})); // 4
        System.out.println(solution(5, new int[]{1,2,4}, new int[]{2,3,4,5})); // 5
        System.out.println(solution(7, new int[]{2,3,4}, new int[]{1,2,3,6})); // 6
        System.out.println(solution(3, new int[]{1,2}, new int[]{2,3})); // 2

        System.out.println(solution(9, new int[]{2,4,7,8}, new int[]{3,6,9})); // 8
        System.out.println(solution(5, new int[]{2,4}, new int[]{3,5})); // 5
        System.out.println(solution(6, new int[]{1,3,5}, new int[]{2,4,6})); // 6


        HashSet set = new HashSet<Integer>();
        set.add(3);
        set.add(2);
        set.add(1);

        System.out.println(set);


    }
}
