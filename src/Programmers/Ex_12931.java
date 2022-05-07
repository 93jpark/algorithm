package Programmers;

public class Ex_12931 {

    /*
        레벨1
        자릿수 더하기
     */

    public int solution(int n) {
        int answer = 0;

        String s = Integer.toString(n);

        for(int i=0; i<s.length(); i++) {
            int num = Integer.valueOf(s.charAt(i)+"");
            answer += num;

        }

        return answer;
    }
}
