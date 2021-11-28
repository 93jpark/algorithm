package baekjoon;

import java.math.*;
import java.util.*;
import java.io.*;

public class Ex_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        BigInteger n = new BigInteger(sc.next());
        BigInteger sum = new BigInteger("0");

        for(int i = 0; i < k; i++) {
            sum = sum.add(n.mod(BigInteger.valueOf(10)));
            n = n.divide(BigInteger.valueOf(10));
        }
        System.out.println(sum.toString());
    }
}
