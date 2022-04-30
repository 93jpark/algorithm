package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 프린터 42587
 * 스택/큐
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 */
public class Ex_42587 {

    public static int solution(int[] priorities, int location) {
        LinkedList<Integer> works = new LinkedList<>(); // static array to LinkedList
        Queue<Integer> queue = new LinkedList<>();

        int workOrder = 0;

        for(int i=0; i<priorities.length; i++) {
            works.add(priorities[i]);
            queue.add(i);
        }

        while(works.size() > 0) {
            if(isHigherExist(works)) {
                sort(works);
                queue.add(queue.remove());
            } else {
                works.remove(0);
                int printout = queue.remove();
                workOrder++;
                if(printout == location) {
                    return workOrder;
                }
            }
        }

        return -1;

    }

    // sort() move most first element to end of list
    public static void sort(LinkedList<Integer> list) {
        int num = list.remove(0);
        list.add(num);
    }

    public static boolean isHigherExist(LinkedList<Integer> list) {
        int num =  list.get(0);
        for(int i=1; i<list.size(); i++){
            if(list.get(i) > num) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] priorities = new int[]{2, 1, 3, 2};
        int location = 2; // 1

        System.out.println(solution(priorities, location));

        priorities = new int[]{1,1,9,1,1,1};
        location = 0; // 5

        System.out.println(solution(priorities, location));
    }
}
