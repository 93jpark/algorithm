package Programmers;

/**
 * Programmers 숫자 문자열과 영단어
 *
 */

import java.util.*;

public class Ex_81301 {
    public static int solution(String s) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

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
                stack.push(charToNum(c));
            } else {
                int cursor = i;
                while(wordToNum(s.substring(i, cursor+1)) < 0) {
                    cursor++;
                }
                stack.push(wordToNum(s.substring(i, cursor+1)));
                i = cursor;
            }

        }


        int len = stack.size();

        int digit = 1;

        for(int i=0; i<len; i++) {
            int num = stack.pop();
            answer += num * digit;
            digit *= 10;
        }

        return answer;
    }

    public static boolean isNum(char c) {
        if((int)c >= 48 && (int)c <= 57) {
            return true;
        } else {
            return false;
        }
    }

    public static int charToNum(char c) {
        int ascii = (int)c;
        return ascii - 48;
    }

    public static int wordToNum(String s) {
        if(s.equals("zero")) return 0;
        if(s.equals("one")) return 1;
        if(s.equals("two")) return 2;
        if(s.equals("three")) return 3;
        if(s.equals("four")) return 4;
        if(s.equals("five")) return 5;
        if(s.equals("six")) return 6;
        if(s.equals("seven")) return 7;
        if(s.equals("eight")) return 8;
        if(s.equals("nine")) return 9;

        return -1;
    }

    public static void main(String[] args) {

        String s = "one4seveneight";

        s = "23four5six7";
        //(s.substring(0,3) // 23f
        System.out.println(solution(s)); // 234567

        s = "2three45sixseven";
        System.out.println(solution(s)); // 234567

        s = "123";
        System.out.println(solution(s));

    }
}
