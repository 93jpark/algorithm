package baekjoon;
// 단계별로 풀어보기 - 5) 1차원 배열
// 문제번호 10818 최소, 최대
import java.lang.reflect.Array;
import java.util.*;

public class Ex_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            list.add(temp);
        }
        System.out.println(Collections.min(list) + " " + Collections.max(list));
    }
}
