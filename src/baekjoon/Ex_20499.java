package baekjoon;


import java.io.*;
import java.util.*;

public class Ex_20499 {

    static int[] kda = new int[3];

    static void input() {
        FastReader scan = new FastReader();
        String s = scan.next();
        for(int i = 0; i < 3; i++) {
            kda[i] = Integer.parseInt(s.split("/")[i]);
        }

    }

    public static void main(String[] args) {
        input();
        calc();
    }

    static void calc() {
        String s = ((kda[0]+kda[2]) < kda[1]) || kda[1] == 0 ? "hasu" : "gosu";
        System.out.println(s);
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
        long nextLong() {return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
    }
}
