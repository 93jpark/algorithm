package Programmers;

/*
    레벨1
    이상한 문자 만들기
 */

public class Ex_12930 {
    public static String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("  try hello world"));
        System.out.println(solution("try  hello world"));
        System.out.println(solution("try hello world "));
        System.out.println(solution("h  i"));
        System.out.println(solution("bananana"));

    }
}
