package Programmers;

public class Ex_12922 {
    public String solution(int n) {
        String answer = "";

        String word = "수박";

        int num = n / 2;
        int mod = n % 2;

        for(int i=0; i<num; i++) {
            answer += word;
        }

        if(mod == 1) {
            answer += "수";
        }

        return answer;
    }
}
