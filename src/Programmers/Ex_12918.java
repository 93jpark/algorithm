package Programmers;

/*
    레벨 1
    문자열 다루기
 */

public class Ex_12918 {
    public static boolean solution(String s) {
        boolean answer = true;

        for(char c : s.toCharArray()) {
            int ascii = (int)c;
            if(ascii < 48 || ascii > 57) return false;
        }


        return answer;
    }

    public static class NotStringException extends Exception {

    }

    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution("0"));
        System.out.println(solution("9"));


        System.out.println(solution("a1234"));
        //solution("a1234");

        System.out.println((int)'1'); // 49
        System.out.println((int)'9'); // 57
        System.out.println((int)'0'); // 48



    }
}
