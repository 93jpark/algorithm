package baekjoon;

import java.io.*;
import java.util.*;

public class Ex_2798 {

    static int n; // # of cards
    static int m; // max num
    static int[] cards;

    static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt(); // # of cards
        m = scan.nextInt();
        cards = new int[n];
        for(int i=0; i<n; i++) {
            cards[i] = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        input();
        System.out.println(calc());
    }

    static int calc(){
        int max = 0;
        for(int i=0; i<cards.length-2; i++) {
            for(int j=i+1; j<cards.length-1;j++) {

                for(int k=j+1; k<cards.length; k++) {
                    int result = cards[i]+cards[j]+cards[k];
                    if(result > max && result <= m) max = result;
                }
            }

        }
        return max;
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
