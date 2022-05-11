package Programmers;

import java.util.LinkedList;
/*
    레벨 1
    문자열 내림차순으로 배치하기

 */
import java.util.*;

public class Ex_12917 {
    public static String solution(String s) {
        String answer = "";

        LinkedList<Integer> list = new LinkedList<>();

        for(char c : s.toCharArray()) {
            list.add((int)c);
        }

        Collections.sort(list);
        Collections.reverse(list);

        for(int n : list) {
            answer = answer + (char)n;
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg")); // gfedcbZ
    }
}
