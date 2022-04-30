package Programmers;

import java.util.*;

public class Ex_77484 {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};

        HashSet<Integer> candidate = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();

        HashSet<Integer> wins = new HashSet<>();

        int zero = 0;
        int counter = 0;
        int max = 0;
        int min = 0;

        for(int i=0; i<lottos.length; i++) {
            candidate.add(lottos[i]);
            list.add(lottos[i]);
            wins.add(win_nums[i]);

        }

        for(int i : list) {
            if(wins.contains(i)) {
                counter++;
            }
            if(i == 0) {
                zero++;
            }
        }

        if(zero == 0) {
            max = counter;
            min = counter;
        } else {
            max = counter + zero;
            min = counter;
        }

        return new int[]{trans(max), trans(min)};
    }

    public static int trans(int count) {
        switch(count) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }

    public static void main(String[] args) {

        int[] lottos = new int[] {31, 1, 0, 0, 44, 25};
        int[] win_nums = new int[] {31, 1, 10, 45, 6, 19}; // 3, 5
        for(int i : solution(lottos, win_nums)) {
            System.out.println(i);
        }
        System.out.println();

        lottos = new int[]{0, 0, 0, 0, 0, 0};
        win_nums = new int[] {38, 19, 20, 40, 15, 25}; // 1, 6
        for(int i : solution(lottos, win_nums)) {
            System.out.println(i);
        }
        System.out.println();

        lottos = new int[]{45, 4, 35, 20, 3, 9};
        win_nums = new int[]{20, 9, 3, 45, 4, 35}; // 1 , 1
        for(int i : solution(lottos, win_nums)) {
            System.out.println(i);
        }
        System.out.println();

    }
}
