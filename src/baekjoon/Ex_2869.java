package baekjoon;

import java.util.*;
import java.io.*;

public class Ex_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int day = (length - down) / (up - down);
        if ((length - down) % (up - down) != 0)
            day++;

        System.out.println(day);
    }
}
