package Programmers;

import java.util.*;
/*
    레벨 1
    두 개 뽑아서 더하기
 */
public class Ex_68644 {
    public static int[] solution(int[] numbers) {
        int[] answer;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if(!set.contains(sum)) set.add(sum);
            }
        }

        LinkedList<Integer> list = new LinkedList<>(set);

        Collections.sort(list);
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{2,1,3,4,1};
        for(int i : solution(nums))
            System.out.print(i+" ");
        System.out.println();

        nums = new int[]{5,0,2,7};
        for(int i : solution(nums))
            System.out.print(i+" ");
        System.out.println();
    }
}
