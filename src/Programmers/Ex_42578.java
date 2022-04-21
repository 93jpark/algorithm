package Programmers;

import java.util.*;
/**
 * 위장
 * 해시
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 */

public class Ex_42578 {

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> type = new HashMap<>();

        for(int i=0; i<clothes.length; i++) {
            type.put(clothes[i][1], type.getOrDefault(clothes[i][1], 0)+1);
        }

        if(type.keySet().size() > 1) {
            for(Integer i : type.values()) {
                answer = answer * (i + 1);
            }

            /*
            Iterator<Integer> it = type.values().iterator();
            while(it.hasNext())
                answer *= it.next().intValue() + 1;
             */
        } else {
            return clothes.length;
        }

        return --answer;
    }

    public static void main(String[] args) {
        String[][] clothes = new String[][]{
                {"yellowhat", "headgear"},
                {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}};

        System.out.println(solution(clothes));

        System.out.println();

        clothes = new String[][]{
                {"crowmask", "face"},
                {"bluesunglasses", "face"},
                {"smoky_makeup", "face"}};

        System.out.println(solution(clothes));







    }
}
