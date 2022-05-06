package Programmers;

/*
    레벨 1
    같은 숫자는 싫어
 */

import java.util.HashSet;
import java.util.LinkedList;
public class Ex_12906 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int prev = -1;

        LinkedList<Integer> list = new LinkedList<>();

        for(int i : arr) {
            if(prev != i) {
                prev = i;
                list.add(i);
            }
        }

        answer = new int[list.size()];
        int count = 0;
        for(int i: list) {
            answer[count++] = i;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,3,3,0,1,1};

        for(int i: solution(arr)) {
            System.out.println(i);
        } // 1,3,0,1
        System.out.println();

        arr = new int[]{4,4,4,3,3};
        for(int i: solution(arr)) {
            System.out.println(i);
        } // 4,3
        System.out.println();


    }
}
