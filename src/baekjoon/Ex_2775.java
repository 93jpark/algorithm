package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_2775 {

    static int t;
    static int[] k; // floor
    static int[] n; // room number

    static void input() {
        FastReader scan = new FastReader();
        t = scan.nextInt();
        k = new int[t];
        n = new int[t];

        for(int i=0; i<t; i++) {
            k[i] = scan.nextInt();
            n[i] = scan.nextInt();
        }

    }

    public static void main(String[] args) {
        input();

        for(int i = 0; i < t; i++) {
            calc(k[i],n[i]);
        }

    }

    static void calc(int k, int n){
        // k+1인 이유는 최소 0,1(2개층)이 필요
        // 만약 int[k][n]일때, k=1이라면, 배열은 0층 n호 건물이 되어버림.
        int[][] rooms = new int[k+1][n];
        for(int i = 0; i <= k; i++) { // 층수
            for(int j = 0; j < n; j++) { // 방번호는 1호부터 시작함
                if(i == 0) {
                    rooms[i][j] = 1 + j;
                    //System.out.println(i+"층"+j+"호 는 "+rooms[i][j]);

                } else {
                    for(int l = 0; l <= j; l++) { // l은 (a-1)층의 호수
                        rooms[i][j] += rooms[i-1][l]; // (a-1)층의 b호까지의 거주민 합
                        //System.out.println("\t"+i+"층"+j+"호 는 "+rooms[i][j]+"\t"+l);
                    }
                    //System.out.println();
                }
            }
        }
        System.out.println(rooms[k][n-1]); // 방번호는 1호부터 시작함으로 출력할땐 -1
    }




    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws IOException {
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
