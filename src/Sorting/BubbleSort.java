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
            boolean flag = true; // 교체된 이력을 체크하는 flag 변수

            // j for문에서 -i를 하는 이유는 이미 정렬된 뒤쪽 원소들은 더이상 체크하지 않음
            for(int j=0; j<list.size()-1-i;j++){
                if(list.get(j) > list.get(j+1)) {
                    Collections.swap(list, j, j+1);
                    flag = false; // 교체된 이력이 있음
                    System.out.println(list);
                }
            }
            // 한번도 swap이 일어난 적이 없다면 모든 원소가 정렬됨을 의미함
            if(flag) {
                break;
            }
        }

    }
}
