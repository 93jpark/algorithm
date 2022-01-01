package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_10828 {

    static int n;
    static Stack<Integer> stack;
    static String[] commands;
    static ArrayList<Integer> list;

    static void input() {
        FastReader scan = new FastReader();
        n = scan.nextInt();
        commands = new String[n];
        stack = new Stack<>();
        list = new ArrayList<>();

        for(int i=0; i<n; i++){
            commands[i] = scan.nextLine();
        }

    }

    public static void main(String[] args) {
        input();
        calc();
    }

    static void calc() {
        for(int i=0; i<n; i++){
            String s = commands[i];
            String cmd = s;
            if(s.indexOf(" ")>0){ // 연산이 필요한 경우
                int num = Integer.parseInt(s.substring(s.indexOf(" ")+1, s.length()));
                cmd = s.substring(0,s.indexOf(" "));
                parse(cmd, num);
            } else { // 연산이 필요없는 경우
                parse(cmd);
            }


        }
    }

    static void parse(String cmd) {
        switch(cmd) {
            case "pop":
                System.out.println(stack.isEmpty() ? -1 : stack.pop()); break;
            case "size":
                System.out.println(stack.size()); break;
            case "empty":
                System.out.println(stack.isEmpty() ? 1 : 0); break;
            case "top":
                System.out.println(stack.isEmpty() ? -1 : stack.peek()); break;
            default:
                System.out.println("invalid command"); break;
        }
    }

    static void parse(String cmd, int num) {
        stack.push(num);
    }

    static void print() {

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
        Double nextDouble() {return Double.parseDouble(next());}
    }
}
