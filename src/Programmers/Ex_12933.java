package Programmers;

import java.util.*;

/*
    레벨 1
    정수 내림차순으로 배치하기
 */

public class Ex_12933 {
    public static long solution(long n) {
        long answer = 0;

        String s = Long.toString(n);

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<s.length(); i++) {
            int num = Integer.valueOf(s.charAt(i)+"");
            list.add(num);
        }

        Collections.sort(list);

        s = "";
        for(int i : list) {
            s = i + s;
        }

        return Long.valueOf(s);
    }

    public static void main(String[] args) {

        System.out.println(solution(2873949));
    }
}
