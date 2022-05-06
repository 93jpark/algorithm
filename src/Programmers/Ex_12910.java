package Programmers;

import java.util.*;
/*
    나누어 떨어지는 숫자 배열
 */

public class Ex_12910 {

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        LinkedList<Integer> list = new LinkedList<>();

        for(int i: arr) {
            if(i % divisor == 0) {
                list.add(i);
            }
        }

        if(list.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(list);

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        /*
            arr	            divisor	    return
            [5, 9, 7, 10]	5	        [5, 10]
            [2, 36, 1, 3]	1	        [1, 2, 3, 36]
            [3,2,6]        	10	        [-1]
         */

        int[] arr = new int[]{5,9,7,10};
        int divisor = 5;

        for(int i: solution(arr, divisor)){
            System.out.println(i);
        }
        System.out.println(); // 5, 10

        arr = new int[] {2, 36, 1, 3};
        divisor = 1;
        for(int i: solution(arr, divisor)){
            System.out.println(i);
        }
        System.out.println(); // 1, 2, 3, 36

        arr = new int[] {3,2,6};
        divisor = 10;
        for(int i: solution(arr, divisor)){
            System.out.println(i);
        }
        System.out.println(); // -1




    }
}
