package baekjoon;

import java.math.*;
import java.util.*;
import java.io.*;

public class Ex_11720 {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        // constructor
        public FastReader() {
            // get input stream for System input
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

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() { return Double.parseDouble(next()); }

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
    public static void main(String[] args) {

        FastReader scan = new FastReader();

        int k = scan.nextInt();
        BigInteger n = new BigInteger(scan.next());
        BigInteger sum = new BigInteger("0");

        for(int i = 0; i < k; i++) {
            sum = sum.add(n.mod(BigInteger.valueOf(10)));
            n = n.divide(BigInteger.valueOf(10));
        }
        System.out.println(sum.toString());
    }

}
