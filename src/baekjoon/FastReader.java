package baekjoon;
import java.util.*;
import java.io.*;

public class FastReader {

    BufferedReader br;
    StringTokenizer st;

    // constructor
    public FastReader() {
        // get input stream for System input
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    // constructor when get String as input
    public FastReader(String s) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(new File(s)));
    }

    //
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

    // get string with exception handling
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
