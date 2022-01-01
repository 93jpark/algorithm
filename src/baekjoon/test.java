package baekjoon;

import java.io.*;
import java.util.*;
import DataStructure.*;
import org.w3c.dom.ls.LSOutput;

public class test {

    static int a;

    public static void main(String[] args) {
        input();
    }

    static void input() {
        // 인풋을 받는 함수
        FastReader scan = new FastReader();
        a = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
    }

    static class FastReader{
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
