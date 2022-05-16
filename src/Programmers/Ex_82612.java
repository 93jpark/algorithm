package Programmers;
/*
    레벨 1
    부족한 금액 계산하기
 */
public class Ex_82612 {
    public static long solution(int price, int money, int count) {
        long answer = -1;

        long total = 0;

        for(int i=0; i<count; i++) {
            total += price * (1 * (i+1));
            System.out.println(price * (1 * (i+1)));
        }

        if(money - total >= 0) {
            return 0;
        } else {
            return (money - total) * -1;
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
