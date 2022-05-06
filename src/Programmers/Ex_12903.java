package Programmers;

/*
    레벨 1
    가운데 글자 가져오기
 */

public class Ex_12903 {
    public String solution(String s) {
        String answer = "";

        if(s.length() % 2 == 1) {
            return ""+s.charAt(s.length()/2);
        } else {
            return s.substring((s.length()/2)-1, (s.length()/2)+1);
        }

    }
}
