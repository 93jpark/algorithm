package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Ex_13136 {

    static long R;
    static long C;
    static long N;

    static void input() {
        FastReader scan = new FastReader();
        R = scan.nextLong();
        C = scan.nextLong();
        N = scan.nextLong();
    }

    public static void main(String[] args) {
        input();
        calc();
    }

    static void calc() {
        //System.out.println(R+" "+C+" "+N);
        long _R, _C, result;

        _R = R/N;
        _C = C/N;

        if(R%N > 0) {
            _R++;
        }

        if(C%N > 0) {
            _C++;
        }

        //System.out.println(_R+" "+_C);
        System.out.println(_R*_C);
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
