package baekjoon;

import java.io.*;
import java.util.*;

public class Ex_11557 {

    static int t;
    static List<HashMap<Integer, String>> map;

    static void input() {
        FastReader scan = new FastReader();
        t = scan.nextInt();
        map = new ArrayList<HashMap<Integer, String>>();
        for(int i=0; i<t; i++) {
            int cases = scan.nextInt();
            map.add(new HashMap<Integer, String>());
            for(int j=0; j<cases; j++) {
                String s = scan.nextLine();
                Integer num = Integer.parseInt(s.split(" ")[1]);
                String name = s.split(" ")[0];
                map.get(i).put(num, name);
            }
        }
    }

    public static void main(String[] args) {
        input();
        calc();
    }

    static void calc() {
        for(int i = 0; i < t; i++) {
            HashMap<Integer, String> m = map.get(i);
            // https://blog.advenoh.pe.kr/java/자바8-스트림-사용해서-max값-추출하기/
            Integer max = m.keySet().stream().mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);
            System.out.println(m.get(max));
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
        Long nextLong() { return Long.parseLong(next()); }
        Double nextDouble() { return Double.parseDouble(next()); }

    }
}
