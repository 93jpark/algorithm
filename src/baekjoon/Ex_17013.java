package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Ex_17013 {

    static String s;
    static int[] nums;

    static void input() {
        FastReader scan = new FastReader();
        s = scan.next();
        nums = new int[]{1, 2, 3, 4};
    }

    public static void main(String[] args) {
        input();
        calc();
        disp();
    }

    static void calc() {
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'H') {
                //System.out.println('H');
                HorizontalFlip();
            }
            if(s.charAt(i) == 'V') {
                //System.out.println('V');
                VerticalFlip();
            }
        }
    }

    static void disp() {
        for(int i=0; i<4; i++) {
            System.out.print(nums[i]+" ");
            if(i == 1) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    static void VerticalFlip() {
        // swap 1-2, 3-4
        int[] temp = {nums[0], nums[2]};
        nums[0] = nums[1];
        nums[1] = temp[0];
        nums[2] = nums[3];
        nums[3] = temp[1];

    }

    static void HorizontalFlip() {
        // swap 1-3, 2-4
        int[] temp = {nums[0], nums[1]};
        nums[0] = nums[2];
        nums[1] = nums[3];
        nums[2] = temp[0];
        nums[3] = temp[1];

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
