package baekjoon;

import java.io.*;
import java.util.*;

public class Ex_12833 {

    static int A, B, C;

    static void input() {
        FastReader scan = new FastReader();
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
    }

    public static void main(String[] args) {
        input();
        calc();
    }

    static void calc() {
        int t = C % 2;
        Integer.toBinaryString(A);
        Integer.toBinaryString(B);

        System.out.println(t == 1 ? A^B : A);

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
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
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
    }
}
