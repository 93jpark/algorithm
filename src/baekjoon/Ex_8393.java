package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_8393 {

    static int n;

    static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();

    }

    public static void main(String[] args) {
        input();
        System.out.println(calc());
    }

    static int calc() {
        int result = 0;
        for(int i=1;i<=n;i++){
            result = i + result;
        }
        return result;
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
        Double nextDouble() { return Double.parseDouble(next()); }
    }


}
