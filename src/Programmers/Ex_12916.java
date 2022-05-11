package Programmers;

/*
    레벨 1
    문자열 내 p와 y의 개수
 */

public class Ex_12916 {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;

        s = s.toLowerCase();

        for(char c : s.toCharArray()) {
            if(c == 'p') p++;
            if(c == 'y') y++;
        }

        return p==y;
    }
}
