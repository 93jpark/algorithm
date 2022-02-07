package Sorting;

import java.util.*;

public class BubbleSort {
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



        for(int i=0; i<list.size()-1; i++) {
            boolean flag = true;

            for(int j=0; j<list.size()-1-i;j++){
                if(list.get(j) > list.get(j+1)) {
                    Collections.swap(list, j, j+1);
                    flag = false;
                    System.out.println(list);
                }
            }
            if(flag) {
                break;
            }
        }

    }
}
