package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(9);

        list  = sort(list);
        System.out.println(list);
    }

    static ArrayList<Integer> sort(ArrayList<Integer> list) {
        if(list.size() <= 1) {
            return list;
        }
        int pivot = list.get(0);

        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        for(int index = 1; index < list.size(); index++) {
            if(list.get(index) > pivot) {
                right.add(list.get(index));
            } else {
                left.add(list.get(index));
            }
        }

        ArrayList<Integer> mergedArr = new ArrayList<Integer>();
        mergedArr.addAll(sort(left));
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(sort(right));

        return mergedArr;
    }
}
