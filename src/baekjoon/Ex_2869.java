package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_2869 {

    static int a; // 낮 올라갈수있는 길이
    static int b; // 매일밤 미끄러지는 길이
    static int v; // 나무막대 높이 100

    static int day;

    static void input() {
        FastReader scan = new FastReader();
        a = scan.nextInt(); // 10
        b = scan.nextInt(); // 3
        v = scan.nextInt(); // 10
        // a-b : 하루에 올라갈 수 있는 높이
        day = v-a;
    }


    public static void main(String[] args) {
        input();
        int remainDist = v-(day*a)+(day*b);

        while(remainDist >= 0) {
            day++;
            remainDist -= a;
            if(remainDist <= 0) break;
            remainDist += b;
        }
        System.out.println(day);

        // move method is way to solve with recurrsion
        // move(v);

    }

    static void move(int remainDist) {
        day++;
        remainDist -= a;
        if(remainDist<=0){
            System.out.println(day);
        } else {
            remainDist += b;
            move(remainDist);
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
        double nextDouble() { return Double.parseDouble(next()); }

    }
}
