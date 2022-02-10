package Sorting;

import java.util.ArrayList;
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

        System.out.println(list);

        for(int i=0; i < list.size()-1; i++) {
            for(int j = i+1; j>0; j--) {
                if(list.get(j) < list.get(j-1)) {
                    Collections.swap(list, j, j-1);
                } else {
                    break;
                }
            }
        }

        System.out.println(list);
    }
}
