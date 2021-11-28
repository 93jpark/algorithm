package baekjoon;

import java.util.*;
import java.io.*;


public class Ex_10809 {

    static String s;
    static int[] arr = new int[26];

    static void input() {
        FastReader scan = new FastReader();
        s = scan.next();
        // init mapping array
        Arrays.fill(arr, -1);
    }

    public static void main(String[] args) {
        input();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(arr[((int)c)-97] == -1) {
                arr[((int)c)-97] = i;
            }
        }
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            result+=(arr[i]+" ");
        }
        System.out.println(result);
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

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
    }
}
