package Programmers;

/*
    레벨 1
    소수 찾기
 */

public class Ex_12921 {
    public static int solution(int n) {
        int answer = 0;

        boolean[] primes = new boolean[n+1];

        // 0,1은 소수가 아니다.
        primes[0] = primes[1] = false;

        // 먼저, 배열에서 모두 소수로 처리함
        for(int i=2; i<=n; i++) {
            primes[i] = true;
        }

        // 배수가 n인 최대 정수(i)의 배수 경우를 탐색함
        for(int i=2; i<=(int)Math.sqrt(n); i++) {

            // 낮은 정수부터 탐색하고,
            // 만약 해당 정수가 소수라면,
            if(primes[i]) {
                // 해당 정수의 모든 배수를 소수가 아님으로 처리
                for(int j=i*i; j<=n; j+=i) {
                    primes[j] = false;
                }
            }

        }

        // 소수의 갯수를 primes배열에서 카운팅한다.
        for(int i=0; i<=n; i++) {
            if(primes[i]) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(40)); // 15
        System.out.println(solution(10)); // 4

        System.out.println(solution(5)); // 3


    }
}
