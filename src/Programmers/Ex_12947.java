package Programmers;

/*
    레벨 1
    하샤드 수
 */

public class Ex_12947 {
    public static boolean solution(int x) {
        boolean answer = true;

        String s = Integer.toString(x);
        int sum = 0;

        for(int i=0; i<s.length(); i++) {
            sum += Integer.valueOf(s.charAt(i)+"");
        }

        return x % sum == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));


    }
}
