package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(9);

        System.out.println("-- init state --");
        System.out.println(list);
        System.out.println("-- sorting --");
        for(int i=0; i<list.size()-2; i++) {

            int cursor = i; // data locate in head which will be replaced with min value
            int min_idx = i; // remember min value index
            boolean flag = false;

            for(int j=i+1; j<list.size()-1; j++) {
                if(list.get(min_idx) > list.get(j)){
                    min_idx = j;
                    flag = true;
                }
            }

            if(flag) {
                Collections.swap(list, cursor, min_idx);
            }

            System.out.println(list);
        }
        System.out.println("-- result --");
        System.out.print(list);
    }
}
