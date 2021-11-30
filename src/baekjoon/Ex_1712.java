package baekjoon;

import java.util.*;
import java.io.*;
// 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용
// 재료비와 인건비 등 총 B만원의 가변 비용
// C 판매가역
public class Ex_1712 {
        static int A, B, C;
    static void input() {
        FastReader scan  = new FastReader();
        A = scan.nextInt(); // 고정비용
        B = scan.nextInt(); // 가변비용
        C = scan.nextInt(); // 1대 판매가
    }

    public static void main(String[] args) {
        input();

        if(C <= B) {
            System.out.println(-1);
        } else {
            int bep = (A/(C-B)); // when it becomes equal
            System.out.println(bep+1);
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
