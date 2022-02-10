package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Ex_14489 {

    static long A,B,C;

    static void input() {
        FastReader scan = new FastReader();
        A = scan.nextLong();
        B = scan.nextLong();
        C = scan.nextLong();
    }

    public static void main(String[] args) {
        input();
        //System.out.println(A+" "+B+" "+C);
        calc();
    }

    static void calc() {
        if(A-C+B-C > 0) {
            System.out.println(A-C+B-C);
        } else {
            System.out.println(A+B);
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
