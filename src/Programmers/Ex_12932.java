package Programmers;
/*
    레벨1
    자연수 뒤집어 배열로 만들기
 */
public class Ex_12932 {
    public static int[] solution(long n) {
        int[] answer = {};

        String s = Long.toString(n);


        answer = new int[s.length()];
        int index = 0;
        for(int i=s.length()-1; i>=0; i--) {
            answer[index++] = Integer.valueOf(s.charAt(i)+"");
        }

        return answer;
    }

    public static void main(String[] args) {
        for(int i : solution(12345)) {
            System.out.println(i);
        }
        System.out.println();
    }
}
