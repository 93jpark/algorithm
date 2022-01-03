package baekjoon;

import java.io.*;
import java.util.*;

public class Ex_2511 {

    static LinkedList<Integer> A = new LinkedList<>();
    static LinkedList<Integer> B = new LinkedList<>();

    static void input() {
        FastReader scan = new FastReader();

        Arrays.stream(scan.nextLine().split(" "))
                .map(t -> Integer.parseInt(t))
                .forEach(n->A.add(n));
        Arrays.stream(scan.nextLine().split(" "))
                .map(t -> Integer.parseInt(t))
                .forEach(n->B.add(n));

    }

    public static void main(String[] args) {
        input();
        calc();
    }

    static void calc() {
        int scoreA = 0, scoreB = 0;
        boolean flagD = true;
        char winner = 'D';

        for (int i = 0; i < 10; i++) {
            if (A.get(i) > B.get(i)) {
                if (flagD) flagD = false;
                scoreA += 3;
                winner = 'A';
            } else if (A.get(i) < B.get(i)) {
                if (flagD) flagD = false;
                scoreB += 3;
                winner = 'B';
            } else if (A.get(i) == B.get(i)) {
                scoreA += 1;
                scoreB += 1;
            }
        }
        System.out.println(scoreA + " " + scoreB);

        if (flagD) {
            System.out.println(winner);
        } else {
            if (scoreA > scoreB) {
                System.out.println("A");
            } else if (scoreA < scoreB) {
                System.out.println("B");
            } else if (scoreA == scoreB) {
                System.out.println(winner);
            }
        }
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
            while (st == null || !st.hasMoreElements()) {
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
