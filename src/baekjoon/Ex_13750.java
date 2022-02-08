package baekjoon;

import java.io.*;
import java.util.*;

public class Ex_13750 {

    static int len;
    static ArrayList<Integer> list = new ArrayList<>();

    static void input() {
        FastReader scan = new FastReader();
        len = scan.nextInt();
        for(int i=0; i<len; i++) {
            list.add(scan.nextInt());
        }
    }

    public static void main(String[] args) {
        input();
        //System.out.println(list.toString());
        calc();
    }

    static void calc() {
        if(list.size() == 1) {
            System.out.println(1);
        } else {
            int flag = 0; // 1: increase 0: equal -1: decrease
            int z = 0;
            int prev = list.get(0);
            int cursor = list.get(1);


            for(int i=0; i<list.size(); i++) {
                if(i==0) {
                    prev = list.get(i);
                } else {
                    // start from when i is 2
                    cursor = list.get(i);
                    if(prev < cursor) {
                        if(flag != 1) {
                            flag = 1;
                            z++;
                        }
                    } else if (prev > cursor) {
                        if(flag != -1) {
                            flag = -1;
                            z++;
                        }
                    } else {
                        // when prev and prev's prev equal, and
                        // cursor and prev is equal then does not change flag
                        flag = flag;
                        // but, if at least once flag is changed, never be 0 again
                    }
                    prev = list.get(i);
                }

            }

            // when there's no changes in decrease/increase status
            // least sequence length would be 1
            if(z == 0) {
                System.out.println(1);
            } else {
                System.out.println(z+1);
            }
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
