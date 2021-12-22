// 평균은 넘겠지

package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_4344 {

    static int t; // 총 테스트 케이스 수
    static LinkedList<int[]> cases;


    static void input() {
        FastReader scan = new FastReader();
        t = scan.nextInt();
        cases = new LinkedList<>();
        for(int i=0; i<t; i++) {
            int n = scan.nextInt();
            cases.add(new int[n]);
            for(int j=0; j<n; j++) {
                cases.get(i)[j] = scan.nextInt();
            }
        }

    }

    public static void main(String[] args) {
        input();
        getAvg(cases);

    }


    static void getAvg(LinkedList<int[]> cases) {

        for(int i=0; i<t; i++) {
            int numScores = cases.get(i).length;
            double sum = 0;


            for(int j = 0; j < numScores; j++) {
                sum += cases.get(i)[j];
            }

            double avg = sum / numScores;
            long test = Arrays.stream(cases.get(i))
                            .filter(n -> n > avg)
                            .count();

            double numPass = ((double)test/numScores) * 100;
            System.out.println(String.format("%.3f", numPass)+"%");

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
