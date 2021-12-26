package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_2908 {

    static int A;
    static int B;

    static void input() {
        FastReader scan = new FastReader();
        A = scan.nextInt();
        B = scan.nextInt();
    }

    public static void main(String[] args) {
        input();
        calc();
    }

    static void calc() {
        StringBuilder strA = new StringBuilder(Integer.toString(A));
        StringBuilder strB = new StringBuilder(Integer.toString(B));
        strA.reverse();
        strB.reverse();

        A = Integer.parseInt(strA.toString());
        B = Integer.parseInt(strB.toString());

        System.out.println(A > B ? A : B);

    }

    static class FastReader{
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
