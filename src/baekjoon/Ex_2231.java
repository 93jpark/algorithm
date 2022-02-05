package baekjoon;

import java.io.*;
import java.util.*;

public class Ex_2231 {

    static int N;

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
    }

    public static void main(String[] args) {
        input();
        //System.out.println(N);
        calc();
    }

    static void calc() {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = N; i > 0; i--) {
            String digit = Integer.toString(i);
            int result = i;
            for(int j = 0; j < digit.length(); j++) {
                result += Integer.parseInt(digit.charAt(j)+"");
            }
            if(result == N) {
                stack.push(i);
            }
        }
        System.out.println(stack.peek());
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

