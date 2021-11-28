package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_2675 {

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

        int nextInt() { return Integer.parseInt(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }

    static int k;
    static String[] strArr;
    static int[] strRep;

    static void input() {
        FastReader scan = new FastReader();
        k = scan.nextInt();
        strArr = new String[k];
        strRep = new int[k];
        for(int i = 0; i < k; i++) {
            strRep[i] = scan.nextInt();
            strArr[i] = scan.next();
        }

    }

    public static void main(String[] args) {
        input();
        for(int i=0; i<k; i++) {
            String s = "";
            // iterator with j -> a case for each String elements
            for(int j=0; j<strArr[i].length(); j++) {
                // itertor with alpha -> characters of each String
                for(int alpha=0; alpha<strRep[i]; alpha++){
                    s += strArr[i].charAt(j);
                }
            }
            System.out.println(s);
        }

    }

}
