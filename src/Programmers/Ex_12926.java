package Programmers;

/*
    레벨 1
    시저암호
 */

public class Ex_12926 {
    public static String solution(String s, int n) {
        String answer = "";
        /*
            A 65
            Z 90
            a 97
            z 122
            ' ' 32
         */

        for(char c : s.toCharArray()) {
            int ascii = (int)c;

            if(ascii == 32) {
                answer = answer + " ";
            } else if (ascii >= 65 && ascii <= 90) {

                if(ascii+n > 90) {
                    int mod = (ascii+n) % 90;
                    ascii = 65 + mod - 1;
                } else {
                    ascii = ascii + n;
                }
                answer = answer + (char)ascii;
            } else if (ascii >= 97 && ascii <= 122) {

                if(ascii+n > 122) {
                    int mod = (ascii+n) % 122;
                    ascii = 97 + mod - 1;
                } else {
                    ascii = ascii + n;
                }
                answer = answer + (char)ascii;
            }

        }


        return answer;
    }

    public static void main(String[] args) {

        String s = "AB";
        int n = 1; // BC
        System.out.println("case1:"+solution(s, n));
        System.out.println();

        s = "z";
        n = 1; // a
        System.out.println("case2:"+solution(s, n));
        System.out.println();

        s = "a B z";
        n = 4; // e F d
        System.out.println("case3:"+solution(s, n));
        System.out.println();


    }
}
