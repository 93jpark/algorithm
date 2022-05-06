package Programmers;
/*
    레벨1
    서울에서 김서방 찾기
 */
public class Ex_12919 {
    public String solution(String[] seoul) {
        String answer = "";

        int count = 0;

        for(String s : seoul) {
            if(s.equals("Kim")) return "김서방은 "+count+"에 있다";
            count++;
        }

        return answer;
    }
}
