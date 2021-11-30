package baekjoon;

import java.util.*;
import java.io.*;
import static java.lang.Character.toUpperCase;

public class Ex_1157 {

    static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    static String str;
    static void input() {
        FastReader scan = new FastReader();
        str = scan.next();
    }

    public static void main(String[] args) {
        input();
        for(int i=0; i < str.length(); i++) {
            Character c = str.charAt(i);
            c = toUpperCase(c);
            if(map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c)+1);
            }
        }
        int max = Collections.max(map.values());
        int freq = Collections.frequency(map.values(), max);
        if(freq > 1) {
            System.out.println("?");
        } else {
            ArrayList al = new ArrayList(map.values());
            int idx = al.indexOf(max);
            List keys = Arrays.asList(map.keySet());
            int i = 0;
            Character result = null;
            for(char key : map.keySet()) {
                if(idx == i) {
                    result = key;
                }
                i++;
            }
            System.out.println(result);

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
            while(st ==  null || !st.hasMoreElements()) {
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}
