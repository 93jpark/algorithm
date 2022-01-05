package baekjoon;

import java.io.*;
import java.util.*;

public class Ex_15649 {

    static int m, n;
    static int list[];//, check[]; // list[]: 결과물, check[]:1~9숫자 중 사용했었는지 기록.
    static boolean check[];

    static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        m = scan.nextInt();
        check = new boolean[n + 1];
        list = new int[m + 1];
    }

    public static void main(String[] args) {
        input();
        dfs(0);
    }

    static void dfs(int index) {
        if(index == m) {
            for(int i=0; i<m; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=1; i<=n; i++) {

            if(!check[i]) {
                check[i] = true;
                list[index] = i;
                dfs(index+1);
                check[i] = false;
            }
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
