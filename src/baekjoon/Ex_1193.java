package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_1193 {

    static int x;

    static void input() {
        FastReader scan = new FastReader();
        x = scan.nextInt();

    }

    public static void main(String[] args) {
        input();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws IOException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while( st == null || !st.hasMoreElements() ) {
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
            } catch ( IOError e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
    }
}
