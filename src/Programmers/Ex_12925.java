package Programmers;
/*
    레벨 1
    문자열을 정수로 바꾸기
 */
public class Ex_12925 {
    public int solution(String s) {
        int answer = 0;
        boolean flag = false;


        if(s.charAt(0) == '-') {
            answer = Integer.valueOf(s.substring(1));
            answer *= -1;
        } else {
            answer = Integer.valueOf(s);
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
