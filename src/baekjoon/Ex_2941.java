package baekjoon;


import java.io.*;
import java.util.*;

public class Ex_2941 {

    static String s;

    static void input() {
        FastReader scan = new FastReader();
        s = scan.next();
    }

    public static void main(String[] args) {
        input();
        calc(s);
    }

    static void calc(String s) {
        // c= c- dz= d- li nj s= z=
        // ddz=z=

        int count = 0;
        boolean flag = true;

        while(flag){
            flag = false;
            if(s.contains("c=")) {
                s = s.split("c=", 2)[0] + "." + s.split("c=", 2)[1];
                flag = true;
            }
            else if(s.contains("c-")) {
                s = s.split("c-", 2)[0] + "." + s.split("c-", 2)[1];
                flag = true;
            }
            else if(s.contains("dz=")) {
                s = s.split("dz=", 2)[0] + "." + s.split("dz=", 2)[1];
                flag = true;
            }
            else if(s.contains("d-")) {
                s = s.split("d-", 2)[0] + "." + s.split("d-", 2)[1];
                flag = true;
            }
            else if(s.contains("lj")) {
                s = s.split("lj", 2)[0] + "." + s.split("lj", 2)[1];
                flag = true;
            }
            else if(s.contains("nj")) {
                s = s.split("nj", 2)[0] + "." + s.split("nj", 2)[1];
                flag = true;
            }
            else if(s.contains("s=")) {
                s = s.split("s=", 2)[0] + "." + s.split("s=", 2)[1];
                flag = true;
            }
            else if(s.contains("z=")) {
                s = s.split("z=", 2)[0] + "." + s.split("z=", 2)[1];
                flag = true;
            }
        }

        System.out.println(s.length());
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

        int nextInt() {return Integer.parseInt(next());}
        long nextLong() {return Long.parseLong(next());}
        double nextDouble() { return Double.parseDouble(next()); }
    }
}
