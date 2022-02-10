package Sorting;

import java.util.*;

public class MergeSort {

    public static ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        int medium = list.size() /2 ;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        left = mergeSplitFunc(new ArrayList<Integer>(list.subList(0, medium)));
        right = mergeSplitFunc(new ArrayList<Integer>(list.subList(medium, list.size())));

        return mergeFunc(left, right);

    }

    public static ArrayList<Integer> mergeFunc(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int leftPoint = 0;
        int rightPoint = 0;

        // CASE1: left/right 둘 다 있을 때
        while(left.size() > leftPoint && right.size() > rightPoint) {
            if(left.get(leftPoint) > right.get(rightPoint)) {
                mergedList.add(right.get(rightPoint));
                rightPoint++;
            } else {
                mergedList.add(left.get(leftPoint));
                leftPoint++;
            }
        }

        // CASE2: right 데이터가 없을 때
        while(left.size() > leftPoint) {
            mergedList.add(left.get(leftPoint));
            leftPoint++;
        }

        // CASE3: left 데이터가 없을 때
        while(right.size() > rightPoint) {
            mergedList.add(right.get(rightPoint));
            rightPoint++;
        }

        return mergedList;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(9);

        System.out.println(list);
        list = mergeSplitFunc(list);
        System.out.println(list);


    }
}
