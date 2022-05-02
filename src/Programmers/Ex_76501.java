package Programmers;

public class Ex_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++) {
            int num = absolutes[i];
            if(!signs[i]) num = num * -1;
            answer += num;
        }

        return answer;
    }
}
