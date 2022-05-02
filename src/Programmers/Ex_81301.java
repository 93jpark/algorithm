package Programmers;

/**
 * Programmers 숫자 문자열과 영단어
 *
 */

import java.util.*;

public class Ex_81301 {
    public static int solution(String s) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        /**
         * ASCII table
         * 0 : 30
         * 1 : 31
         *  ...
         * 9 : 39
         */

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(isNum(c)) {
                queue.add(charToNum(c));
            }
        }



        return answer;
    }

    public static boolean isNum(char c) {
        if((int)c >= 30 && (int)c <= 39) {
            return true;
        } else {
            return false;
        }
    }

    public static int charToNum(char c) {
        int ascii = (int)c;
        return ascii - 30;
    }

    public static int wordToNum(String s) {
        switch(s) {
            case "zero" : return 0;
            case "one" : return 1;
            case "two" : return 2;
            case "three" : return 3;
            case "four" : return 4;
            case "five" : return 5;
            case "six" : return 6;
            case "seven" : return 7;
            case "eight" : return 8;
            case "nine" : return 9;
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "one4seveneight";

        s = "23four5six7";
        System.out.println(solution(s));

        s = "2three45sixseven";
        System.out.println(solution(s));

        s = "123";
        System.out.println(solution(s));

    }
}
