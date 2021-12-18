package baekjoon;

import java.util.*;
import DataStructure.*;
import org.w3c.dom.ls.LSOutput;

public class test {
    public static void main(String[] args) {
        long qty = 2100001;
        long A = 2100000; // 고정비용
        long B = 9; // 가변비용
        long C = 10; // 판매금액

        System.out.println("총 매출:"+(qty*C));
        System.out.println("총 비용:"+(A+(qty*B)));


    }

}
