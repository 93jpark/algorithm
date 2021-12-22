// 단계별로 풀어보기 - 1 입출력과 사칙연산
// 문제번호 2557 Hello World
package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_2577 {

    static int result;

    static void input() {
        FastReader scan = new FastReader();
        result = scan.nextInt() * scan.nextInt() * scan.nextInt();

    }

    public static void main(String[] args) {
        input();
        disp(calc(result));
    }

    static int[] calc(int n) {
        int[] result = new int[10];
        int numLen = Integer.toString(n).length();
        for(int i = 0; i < numLen; i++) {
            result[n%10]++;
            n /= 10;
        }
        return result;
    }

    static void disp(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
    }


}
