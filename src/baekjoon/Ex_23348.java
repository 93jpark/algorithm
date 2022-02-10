package baekjoon;

import java.io.*;
import java.util.*;

public class Ex_23348 {

    static int scores[] = new int[3];
    static int N;
    static ArrayList<Integer> list = new ArrayList<>();


    static void input() {
        FastReader scan = new FastReader();
        for(int i=0; i<3; i++) {
            scores[i] = scan.nextInt();
        }
        N = scan.nextInt();

        for(int i=0; i<N; i++) {
            int A=0;
            int B=0;
            int C=0;

            for(int j=0; j<3; j++) { // each player
                A += scan.nextInt();
                B += scan.nextInt();
                C += scan.nextInt();
            }

            A = A*scores[0];
            B = B*scores[1];
            C = C*scores[2];
            int result = A+B+C;
            list.add(result);
        }


    }

    public static void main(String[] args) {
        input();
        calc();
    }

    static void calc() {
        //System.out.println(list);
        System.out.println(Collections.max(list));
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
