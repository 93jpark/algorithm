package baekjoon;

import java.util.Scanner;

public class Ex_15813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int total = 0;
        for(char c : s.toCharArray()) {
            total += (int)c-64;
        }
        System.out.println(total);

    }
}
