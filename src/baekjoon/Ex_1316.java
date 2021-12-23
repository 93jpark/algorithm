package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_1316 {

    static int n;
    static String[] s;
    static Stack<Character>[] stacks;

    static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        s = new String[n];
        stacks = new Stack[n];

        for(int i=0; i<n; i++){
            s[i] = scan.nextLine();
            stacks[i] = new Stack<Character>();
        }
    }

    public static void main(String[] args) {
        input();
        System.out.println(n-calc());
    }

    static int calc() {
        int count = 0;

        for(int i=0; i<n; i++) {
            int len = s[i].length();
            for(int j=0; j<len; j++) {
                char c = s[i].charAt(j);
                if(stacks[i].isEmpty()) {
                    stacks[i].push(c);
                } else {
                    if(stacks[i].peek() != c) {
                        if(stacks[i].contains(c)) {
                            count++;
                            break;
                        } else {
                            stacks[i].push(c);
                        }
                    }
                }
            }
        }
        return count;
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
