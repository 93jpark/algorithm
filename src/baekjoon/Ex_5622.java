package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_5622 {

    static String s;

    static void input() {
        FastReader scan = new FastReader();
        s = scan.next();
    }

    public static void main(String[] args) {
        input();
        calc();
    }

    static void calc() {
        int result = 0;
        for(int i=0; i<s.length(); i++) {
            //int num = (int)s.charAt(i)-65;

            switch(s.charAt(i)) {
                case'A': case'B':case'C':
                    result+=3;
                    break;
                case'D': case'E':case'F':
                    result+=4;
                    break;
                case'G': case'H':case'I':
                    result+=5;
                    break;
                case'J': case'K':case'L':
                    result+=6;
                    break;
                case'M': case'N':case'O':
                    result+=7;
                    break;
                case'P': case'Q':case'R': case'S':
                    result+=8;
                    break;
                case'T': case'U':case'V':
                    result+=9;
                    break;
                case'W': case'X':case'Y': case'Z':
                    result+=10;
                    break;
            }



            /*
            if(num>=0 && num<3) {
                //System.out.println("ABC");
                result += 3;
            } else if (num>=3 && num<6) {
                result += 4;
                //System.out.println("DEF");
            } else if (num>=6 && num<9) {
                result += 5;
                //System.out.println("GHI");
            } else if (num>=9 && num<12) {
                result += 6;
                //System.out.println("JKL");
            } else if (num>=12 && num<15) {
                result += 7;
                //System.out.println("MNO");
            } else if (num>=15 && num<19) {
                result += 8;
                //System.out.println("PQRS");
            } else if (num>=19 && num<21) {
                result += 9;
                //System.out.println("TUV");
            } else if (num>=21 && num<25) {
                result += 10;
                //System.out.println("WXYZ");
            }

             */
        }
        System.out.println(result);


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
            while( st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLIne() {
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
