package Programmers;

/*
    레벨1
    두 정수 사이의 합
 */

public class Ex_12912 {
    public static long solution(int a, int b) {
        long answer = 0;

        int begin = a < b ? a : b;
        int last = a < b ? b : a;


        for(int i=begin; i <= last; i++) {
            answer += i;
        }


        return answer;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a,b));// 12


        a = 3;
        b= 3;
        System.out.println(solution(a,b));// 3

        a = 5;
        b = 3;
        System.out.println(solution(a,b));// 12
    }
}
