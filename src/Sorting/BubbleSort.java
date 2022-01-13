package Sorting;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(7);


        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                Collections.swap(list, i, i+1);
            }
        }

        System.out.println(list);
    }
}
