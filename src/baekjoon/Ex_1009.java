package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_1009 {

    static int t;
    static int a[];
    static int b[];

    static void input() {
        FastReader scan = new FastReader();
        t = scan.nextInt();
        a = new int[t];
        b = new int[t];

        for(int i=0; i<t; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        input();
        calc();
        //System.out.println(recursive(10,10,10));
    }

    static void calc() {
        for(int i=0; i<t; i++){
            int num = 1;
            for(int j=0; j<b[i]; j++){
                num = (num * a[i]) % 10;
            }
            if(num == 0) {
                System.out.println(10);
            } else {
                System.out.println(num);
            }

        }
    }

    static int recursive(int n, int time, int result) {
        if(time == 1) {
            if(result == 0) return 10;
            return result;
        } else {
            return recursive(n, --time, (n*result)%10);
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
