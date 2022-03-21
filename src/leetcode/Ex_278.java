package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_278 {

    public static void main(String[] args) {
        //System.out.println(isBadVersion(3));
        //System.out.println(firstBadVersion(5));

        List<Integer> list = Arrays.asList(new Integer[10]);
        System.out.println(list.get(9));

    }

    static Boolean isBadVersion(int n) {
        if(n >= 2) {
            return true;
        } else  {
            return false;
        }
    }

    static int firstBadVersion(int n) {

        int begin = 1;
        int end = n; // 5

        while(true) {
            if(end-begin == 0) {
                return begin;
            } else if(end-begin == 1) {
                if(isBadVersion(begin)) {
                    return begin;
                } else {
                    return end;
                }
            }

            int mid = begin + (end-begin) / 2; // 3

            if(isBadVersion(mid)) {
                if(!isBadVersion(mid-1)) {
                    return mid;
                } else {
                    end = mid;
                }
            } else {
                begin = mid;
            }

        }

    }
}
