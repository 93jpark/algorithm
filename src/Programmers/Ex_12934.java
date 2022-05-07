package Programmers;

public class Ex_12934 {
    public long solution(long n) {
        long answer = 0;

        long x = (long)Math.sqrt(n);

        if(Math.pow(x,2) == n) {
            return (long)Math.pow(x+1,2);
        } else {
            return -1;
        }
    }
}
