package Programmers;
/*
    레벨 1
    최대공약수와 최소공배수
 */
public class Ex_12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int a = n < m ? n : m;
        int b = n < m ? m : n;

        // 최소공배수
        for(int i=1; i<=a*b; i++) {
            if(i%a==0 && i%b==0) {
                answer[1] = i;
                break;
            }
        }

        // 최대공약수
        for(int i=b; i>0; i--) {
            if(a%i==0 && b%i==0) {
                answer[0] = i;
                break;
            }
        }


        return answer;
    }
}
