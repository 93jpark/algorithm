package Programmers;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 * 전화번호 목록
 * 해시
 */
public class Ex_42577 {

    /**
     * solution with sort with loop
     * @param phone_book
     * @return
     */
    public static boolean solution1(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i=0; i< phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return answer;
    }

    /**
     * solution with Hash
     * @param phone_book
     * @return
     */
    public static boolean solution2(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> hm = new HashMap<>();

        for(String s : phone_book) {
            hm.put(s, 1);
        }

        for (String str : phone_book) {
            for (int i = 1; i < str.length(); i++) {
                String s = str.substring(0, i);
                if(hm.containsKey(s)) {
                    return false;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        String[] phone_book;

        phone_book = new String[]{"119", "9764223", "1195524421"};
        System.out.println(solution1(phone_book)); // false
        System.out.println(solution2(phone_book)); // false


        phone_book = new String[]{"123", "456", "789"};
        System.out.println(solution1(phone_book)); // true
        System.out.println(solution2(phone_book)); // false

        phone_book = new String[]{"12", "123", "1235", "567", "88"};
        System.out.println(solution1(phone_book)); // false
        System.out.println(solution2(phone_book)); // false

    }
}
