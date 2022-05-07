package Programmers;
import java.util.*;
/*
    레벨1
    직사각형 별찍기
 */

public class Ex_12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int j=0; j<b; j++) {
            for(int i=0; i<a; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
