package Programmers;

import java.util.*;

public class Ex_42748 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int c=0; c< commands.length; c++) {
            int[] command = commands[c];
            int begin = command[0]-1;
            int end = command[1]-1;
            int len = command[2]-1;

            LinkedList<Integer> list = new LinkedList<>();

            for(int i=0; i<=end-begin; i++) {
                list.add(array[begin+i]);
            }
            Collections.sort(list);
            int num = list.get(len);
            answer[c] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        // [5, 6, 3]
        for(int i: solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}})) {
            System.out.println("answer: " + i);
        };


    }
}
