package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_2292 {

    static int n;

    static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
    }

    public static void main(String[] args) {
        input();
        int increase = 0;
        int t = 1;
        while( n > t ) {
            t = t + 6 * ++increase;
        }
        System.out.println(increase+1);
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
