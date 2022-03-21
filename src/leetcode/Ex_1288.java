package leetcode;

import java.util.*;

public class Ex_1288 {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3}};
        int a = removeCoveredIntervals(intervals);
        //System.out.println(a);
    }

    static int removeCoveredIntervals(int[][] intervals) {
        ArrayList<Integer> removed = new ArrayList<>();

        for(int i=0; i<intervals.length-1; i++) {
            if(removed.contains(i)) {
                continue;
            }
            for(int j=i+1; j<intervals.length; j++) {
                if(removed.contains(j)) {
                    continue;
                } else {
                    int[] a = {intervals[i][0], intervals[i][1]};
                    int[] b = {intervals[j][0], intervals[j][1]};

                    if(a[0] <= b[0] && a[1] >= b[1]) {
                        if(!removed.contains(j)) {
                            removed.add(j);
                        }
                    } else if(a[0] >= b[0] && a[1] <= b[1]) {
                        if(!removed.contains(i)) {
                            removed.add(i);
                        }
                    }
                }
            }
        }

        return intervals.length - removed.size();
    }
}
